package com.example.fashionista.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.fashionista.Entites.Users;
import java.util.Optional;


public interface UserRepository extends JpaRepository<Users,Long> {

    Users findByEmail(String email);

    Optional<Users> findAllById(Long id);





}