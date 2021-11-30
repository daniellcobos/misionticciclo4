package com.mintic.reto.repositorio;

import java.util.List;
import java.util.Optional;

import com.mintic.reto.interfaces.InterfaceFragance;
import com.mintic.reto.modelo.Fragance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioFragance {
    @Autowired
    private InterfaceFragance repository;
    public List<Fragance> getAll() {
        return repository.findAll();
    }

    public Optional<Fragance> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Fragance create(Fragance perfume) {
        return repository.save(perfume);
    }

    public void update(Fragance perfume) {
        repository.save(perfume);
    }

    public void delete(Fragance perfume) {
        repository.delete(perfume);
    }
}
