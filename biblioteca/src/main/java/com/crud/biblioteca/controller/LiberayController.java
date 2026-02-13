package com.crud.biblioteca.controller;

import com.crud.biblioteca.liberay.liberay;
import com.crud.biblioteca.service.liberayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LiberayController {

    @Autowired
    private liberayService liberayService;

    public ResponseEntity<List<liberay>> listarTodosOsLivros(){
        List<liberay> listar = liberayService.listarTodosOsLivros();
        return ResponseEntity.ok(listar);
    }
}
