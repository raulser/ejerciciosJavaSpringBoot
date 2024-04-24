package com.example.ejercicios.ejerciciosstream.ejercicio19stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjercicioStream19 {

    public static void main(String[] args){
        List<String> nombres = Arrays.asList("Juan", "Jose", "Ana", "Carlos", "Carlota", "Maria","Antonio");
        Map<Character, String> nombresPorLetra = nombres.stream().collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.joining(", ")));
        System.out.println(nombresPorLetra);
    }
}
