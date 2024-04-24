package com.example.ejercicios.ejerciciosstream.ejercicio21stream;

import java.util.Arrays;
import java.util.List;

public class EjercicioStream21 {

    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(6, 8, 10, 12, 15);
        boolean divisiblePor2Y3 = numeros.stream().anyMatch(num -> num % 2 == 0 && num % 3 == 0);
        System.out.println(divisiblePor2Y3);
    }
}
