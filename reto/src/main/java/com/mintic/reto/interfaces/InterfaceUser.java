package com.mintic.reto.interfaces;

import java.util.Optional;

import com.mintic.reto.modelo.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface InterfaceUser extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}
