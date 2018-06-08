package org.JakeBarron.Cirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.JakeBarron.Cirtual.domains.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
