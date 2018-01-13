package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}