package com.example.ejercicios.ejerciciosstream.ejercicio5stream;

import java.util.Arrays;
import java.util.List;

public class EjercicioStream5 {

    public static void main(String[] args){
        List<String> nombres = Arrays.asList("Juan", "Ana", "Carlos", "Maria");
        int sumaLongitudes = nombres.stream().mapToInt(String::length).sum();
        System.out.println(sumaLongitudes);
    }

}
