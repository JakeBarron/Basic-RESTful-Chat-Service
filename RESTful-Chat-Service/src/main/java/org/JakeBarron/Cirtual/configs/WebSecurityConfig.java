package org.JakeBarron.Cirtual.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig implements WebSecurityConfigurerAdapter {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(Constants.BCRYPT_STRENGTH);
    }
    
    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        
      auth.jdbcAuthentication().dataSource(jdbcTemplate.getDataSource())
        .usersByUsernameQuery(
            "select username,password, enabled from users where username=?")
        .authoritiesByUsernameQuery(
            "select username, authority from authorities where username=?")
        .passwordEncoder(passwordEncoder());      
    }   
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()                
                .mvcMatchers("/*").authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();
        
        http.authorizeRequests().mvcMatchers("/rest/*").authenticated().and().httpBasic();
    }   
    
    
    @Bean
    @Override
    public JdbcUserDetailsManager userDetailsService() {
        JdbcUserDetailsManager manager = new JdbcUserDetailsManager();
        manager.setJdbcTemplate(jdbcTemplate);
        return manager;
    }    
    
}
