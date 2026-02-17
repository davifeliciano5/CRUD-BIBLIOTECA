package com.crud.biblioteca.service;


import com.crud.biblioteca.liberay.LiberayRepository;
import com.crud.biblioteca.liberay.biblioteca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class liberayService {

    private final LiberayRepository liberayRepository;

    public liberayService(LiberayRepository liberayRepository1){
        this.liberayRepository = liberayRepository1;
    }

    public List<biblioteca> listarTodosOsLivros(){
        List<biblioteca> todosOslivros = liberayRepository.findAll();
        return todosOslivros;
    }

    public void cadastrarLivro(biblioteca livro){
        liberayRepository.save(new biblioteca(livro));
    }
}
