package com.example.fashionista.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.fashionista.Entites.Users;

public interface UserRepository extends PagingAndSortingRepository<Users,Long>{

}