package com.example.AdressBookApp.repository;

import com.example.AdressBookApp.model.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AuthUserRepository extends JpaRepository<AuthUser,Long> {
}