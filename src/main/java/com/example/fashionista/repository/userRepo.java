package com.example.fashionista.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.fashionista.Entites.Users;

public interface userRepo extends PagingAndSortingRepository<Users,Long>{

}