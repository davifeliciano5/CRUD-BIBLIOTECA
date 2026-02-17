package com.crud.biblioteca.liberay;


import com.crud.biblioteca.Usuarios.Usuarios;
import jakarta.persistence.*;

@Entity
@Table(name = "biblioteca")
public class biblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nome_livro;

    private String autor_livro;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios usuarios;

    public biblioteca(biblioteca livro) {
        this.autor_livro = livro.autor_livro;
        this.Nome_livro = livro.Nome_livro;
    }
}
