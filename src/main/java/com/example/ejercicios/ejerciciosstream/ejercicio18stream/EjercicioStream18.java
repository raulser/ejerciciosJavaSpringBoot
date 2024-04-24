package com.example.ejercicios.ejerciciosstream.ejercicio18stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjercicioStream18 {

    public static void main(String[] args){
        List<String> nombres = Arrays.asList("Juan", "Ana", "Carlos", "Maria");
        List<String> nombresRecogidos = nombres.stream().peek(System.out::println).collect(Collectors.toList());
    }
}
