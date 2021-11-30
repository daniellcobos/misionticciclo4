package com.mintic.reto.interfaces;

import com.mintic.reto.modelo.Fragance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceFragance extends MongoRepository<Fragance, String> {
}
