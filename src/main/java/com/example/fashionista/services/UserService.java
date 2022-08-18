package com.example.fashionista.services;

import com.example.fashionista.Entites.Users;
import com.example.fashionista.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

@Transactional
public Users updateUser(Users users){

    Users oldUser = userRepository.findByEmail(users.getEmail());
    oldUser.setPassword(users.getPassword());
    oldUser.setName(users.getName());
    oldUser.setDescription(users.getDescription());
    return userRepository.save(oldUser);

}

public Users findOne(String email){
return  userRepository.findByEmail(email);
}

public Users saveUser(Users users){

    // todo:Add the security boot parts after everything works.
    return userRepository.save(users);
}











}
