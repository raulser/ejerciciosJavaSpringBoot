package com.example.ejercicios.ejerciciosstream.ejercicio11stream;

import java.util.Arrays;
import java.util.List;

public class EjercicioStream11 {

    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int sumaImparesDuplicados = numeros.stream().filter(num -> num % 2 != 0).mapToInt(num -> num * 2).sum();
        System.out.println(sumaImparesDuplicados);
    }

}
