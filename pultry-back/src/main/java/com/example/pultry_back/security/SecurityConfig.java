package com.example.pultry_back.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable() // Disable CSRF for testing via Postman
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/users/**").permitAll() // Allow access to user APIs
                .anyRequest().authenticated()
            );
        return http.build();
    }
}