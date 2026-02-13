CREATE TABLE biblioteca (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome_livro VARCHAR(255) NOT NULL,
    autor_livro VARCHAR(255) NOT NULL,
    usuario_id BIGINT NOT NULL,

    PRIMARY KEY (id),

    CONSTRAINT fk_biblioteca_usuario
        FOREIGN KEY (usuario_id)
        REFERENCES usuarios(id)
        ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;