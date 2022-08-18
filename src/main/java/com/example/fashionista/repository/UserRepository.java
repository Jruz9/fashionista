package com.example.fashionista.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.fashionista.Entites.Users;
import java.util.Optional;


public interface UserRepository extends PagingAndSortingRepository<Users,Long>{

    Users findByEmail(String email);

    Optional<Users> findAllById(Long id);





}