package com.ormispring.basic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByEmailAndAge(String email, int age);

  boolean existsByEmail(String email);
}
