package com.crud.biblioteca.service;


import com.crud.biblioteca.liberay.LiberayRepository;
import com.crud.biblioteca.liberay.liberay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class liberayService {

    @Autowired
    private LiberayRepository liberayRepository;

    public List<liberay> listarTodosOsLivros(){
        List<liberay> todosOslivros = liberayRepository.findAll();
        return todosOslivros;
    }

}
