package com.example.pultry_back.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pultry_back.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    
}
