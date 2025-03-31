package com.autopark.repository;

import com.autopark.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Find a user by username
    Optional<User> findByUserName(String username);

    // Check if a user with a specific email exists
    boolean existByEmail(String email);

    // Check if a user with a specific username exists
    boolean existByUserName(String username);
}
