package com.example.ejercicios.ejerciciosstream.ejercicio2stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjercicioStream2 {

    public static void main(String[] args){
        List<String> nombres = Arrays.asList("Juan", "Ana", "Carlos", "Maria");
        List<String> resultado = nombres.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(resultado);
    }

}
