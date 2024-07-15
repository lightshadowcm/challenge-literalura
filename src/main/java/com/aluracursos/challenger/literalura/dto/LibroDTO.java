package com.aluracursos.challenger.literalura.dto;



import com.aluracursos.challenger.literalura.modelos.Autor;


public record LibroDTO(int idLibro,
                       String titulo,
                       Autor autor,
                       String idioma,
                       int numeroDeDescargas
) {
}

