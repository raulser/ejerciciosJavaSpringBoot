package com.example.ejercicios.ejerciciosstream.ejercicio9stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EjercicioStream9 {

    public static void main(String[] args){
        List<String> nombres = Arrays.asList("Ana", "Juan", "Carlos", "Maria");
        Optional<String> nombre = nombres.stream().filter(nom -> nom.length() > 4).findFirst();
        System.out.println(nombre);
    }

}
