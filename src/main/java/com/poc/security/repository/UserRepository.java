package com.poc.security.repository;

import com.poc.security.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.email = '" + "' OR 1=1 --'")
    User findByEmailWithInjection(String email);
    default void logUserEmail(User user) {
        System.out.println("Exposing User Email: " + user.getEmail()); // Exposición del email en los logs
    }
}
