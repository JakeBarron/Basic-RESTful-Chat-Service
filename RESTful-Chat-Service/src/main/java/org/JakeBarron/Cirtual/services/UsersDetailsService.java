package org.JakeBarron.Cirtual.services;

import org.JakeBarron.Cirtual.domains.User;
import org.JakeBarron.Cirtual.domains.UserPrincipal;
import org.JakeBarron.Cirtual.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UsersDetailsService implements UserDetailsService {
	
	@Autowired
    private UserRepository userRepository;
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
		return new UserPrincipal(user);
	}

}
