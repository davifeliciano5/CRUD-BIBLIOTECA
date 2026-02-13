package com.crud.biblioteca.liberay;


import com.crud.biblioteca.Usuarios.Usuarios;
import jakarta.persistence.*;

@Entity
@Table(name = "biblioteca")
public class liberay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nome_livro;

    private String autor_livro;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios usuarios;
}
