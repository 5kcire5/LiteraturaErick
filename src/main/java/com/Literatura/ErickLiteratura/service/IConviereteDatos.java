package com.Literatura.ErickLiteratura.service;

public interface IConviereteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
