package com.aluracursos.challenger.literalura.principal;

import com.aluracursos.challenger.literalura.funciones.Funciones;
import com.aluracursos.challenger.literalura.repositorio.AutorRepository;
import com.aluracursos.challenger.literalura.servicios.ConsumoApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.aluracursos.challenger.literalura.modelos.Autor;
import com.aluracursos.challenger.literalura.modelos.DatosAutor;
import com.aluracursos.challenger.literalura.modelos.DatosLibro;
import com.aluracursos.challenger.literalura.modelos.Libro;
import com.aluracursos.challenger.literalura.modelos.Idioma;
import com.aluracursos.challenger.literalura.repositorio.LibroRepository;
import com.aluracursos.challenger.literalura.servicios.AutorServices;
import com.aluracursos.challenger.literalura.servicios.ConvierteDatos;
import com.aluracursos.challenger.literalura.servicios.LibroServices;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
        public LibroRepository libroRepository;
        private AutorRepository autorRepository;
        private Scanner scanner = new Scanner(System.in);
        private ConsumoApi consumoApi = new ConsumoApi();
        private ConvierteDatos convierteDatos = new ConvierteDatos();
        private DatosLibro datosLibro;
        private DatosAutor datosAutor;
        private LibroServices libroServices = new LibroServices();
        private AutorServices autorServices = new AutorServices();

        private Autor autorDelLibro;
        private int opcion = -1;


        private List<Autor> autores;
        private List<Libro> libros;

        Funciones funciones = new Funciones();



        public Principal(LibroRepository libroRepository, AutorRepository autorRepository) {
            this.autorRepository = autorRepository;
            this.libroRepository = libroRepository;
        }


        public void Menu() throws Exception {


            var textoMenu = """
                \n ==============Menu===================  
                
                 1. Buscar libro por nombre
                 2. buscar libros por autor
                 3. buscar autor por  guardado
                 4. Listar autor vivos en un determinado año
                 5. Listar libro por idioma               
                 6. buscar  libro  por guardado
                
                       \s
                 0. Salir
                \n
                
               \s""";

            do {
                System.out.print(textoMenu);
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 ->funciones.obtenerLibroPorTitulo();
                    case 2 ->funciones.listarLibrosRegistrados();
                    case 3 ->funciones.listarAutoresRegistrados();
                    case 4 ->funciones.listarAutoresVivosPorAno();
                    case 5 ->funciones.listarLibrosPorIdioma();
                    case 7 ->funciones.top10LiborsDescargados();
                    case 6 ->funciones.listadoDeLibrosPorAutor();



                    case 0-> System.out.println("Hasta Luego");
                    default -> System.out.println("Opción Inválida");
                }
            }
            while (opcion != 0);
        }










}
