package com.tnsif.OnetoOneMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.OnetoOneMapping.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
