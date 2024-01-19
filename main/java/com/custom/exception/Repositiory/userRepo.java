package com.custom.exception.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.custom.exception.entity.user;

@Repository
public interface userRepo extends JpaRepository<user, Long> {
	 user findByUsername(String username);
}
