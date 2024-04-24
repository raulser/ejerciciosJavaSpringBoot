package com.example.ejercicios.ejerciciosstream.ejercicio12stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjercicioStream12 {

    public static void main(String[] args){
        List<String> nombres = Arrays.asList("Juan", "Ana", "Carlos", "Maria");
        List<String> primerosNombres = nombres.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(primerosNombres);
    }

}
