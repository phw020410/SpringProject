package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ChemicalService<S> {
    boolean save(S s);

    S findById(Long id);

    List<S> findAll();

    boolean isExist(Long id);

    int count();
    
    boolean deleteById();
    
    boolean deleteAll();
}
