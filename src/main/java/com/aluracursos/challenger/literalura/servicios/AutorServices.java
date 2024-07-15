package com.aluracursos.challenger.literalura.servicios;

import com.aluracursos.challenger.literalura.modelos.Autor;
import com.aluracursos.challenger.literalura.repositorio.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServices {

    @Autowired
    private AutorRepository autorRepository;



    public List<Autor> getAutoresVivosPorAno(int year) {
        return autorRepository.findAutorByFecha(year);
    }


}
