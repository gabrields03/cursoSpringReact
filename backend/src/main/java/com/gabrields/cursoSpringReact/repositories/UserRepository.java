package com.gabrields.cursoSpringReact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrields.cursoSpringReact.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
