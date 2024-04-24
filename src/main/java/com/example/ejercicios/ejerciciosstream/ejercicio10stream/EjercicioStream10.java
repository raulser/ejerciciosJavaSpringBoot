package com.example.ejercicios.ejerciciosstream.ejercicio10stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjercicioStream10 {

    public static void main(String[] args){
        List<String> palabras = Arrays.asList("manzana", "pera", "banana", "melón");
        Map<Character, Long> conteoPorLetra = palabras.stream().collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
        System.out.println(conteoPorLetra);
    }

}
