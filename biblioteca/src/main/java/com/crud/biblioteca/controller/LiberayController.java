package com.crud.biblioteca.controller;

import com.crud.biblioteca.liberay.LiberayRepository;
import com.crud.biblioteca.liberay.biblioteca;
import com.crud.biblioteca.service.liberayService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LiberayController {

    private final liberayService LiberayService;
    public LiberayController(liberayService liberayService){
        LiberayService = liberayService;
    }

    public ResponseEntity<List<biblioteca>> listarTodosOsLivros(){
        List<biblioteca> listar = LiberayService.listarTodosOsLivros();
        return ResponseEntity.ok(listar);
    }

    @PostMapping("/cadastro")
    @Transactional
    public ResponseEntity<String> cadastrarLivro(@RequestBody biblioteca livro){
        LiberayService.cadastrarLivro(livro);
        return ResponseEntity.ok().build();
    }
}
