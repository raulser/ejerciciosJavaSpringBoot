package com.example.ejercicios.ejerciciosstream.ejercicio6stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjercicioStream6 {

    public static void main(String[] args){
        List<List<String>> listas = Arrays.asList(Arrays.asList("Juan", "Ana"), Arrays.asList("Ana", "Carlos"));
        List<String> nombresUnicos = listas.stream().flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(nombresUnicos);
    }

}
