package ar.com.noaa.noaamongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.noaa.noaamongo.entities.Boya;
import ar.com.noaa.noaamongo.repos.BoyaRepository;

@Service
public class BoyaService {
    
    @Autowired
    BoyaRepository repo;
  
    public void crearBoya(Boya boya) {
        repo.save(boya);

    }

    public List<Boya> traerBoyas() {
        return repo.findAll();
    }




}