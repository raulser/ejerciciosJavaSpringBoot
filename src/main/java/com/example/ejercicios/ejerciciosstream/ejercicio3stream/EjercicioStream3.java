package com.example.ejercicios.ejerciciosstream.ejercicio3stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjercicioStream3 {

    public static void main(String[] args){
        List<Persona> personas = Arrays.asList(new Persona("Persona1", "Madrid"), new Persona("Persona2", "Madrid"),
                new Persona("Persona3", "Sevilla"), new Persona("Persona4", "Malaga"));
        Map<String, List<Persona>> personasPorCiudad = personas.stream().collect(Collectors.groupingBy(Persona::getCiudad));
        System.out.println(personasPorCiudad);
    }

}
