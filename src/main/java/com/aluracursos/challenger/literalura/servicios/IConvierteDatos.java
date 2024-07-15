package com.aluracursos.challenger.literalura.servicios;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);

}
