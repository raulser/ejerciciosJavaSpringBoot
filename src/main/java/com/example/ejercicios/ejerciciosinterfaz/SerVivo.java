package com.example.ejercicios.ejerciciosinterfaz;

public interface SerVivo {

    void comer();

    default void respirar(){
        System.out.println("Soy un ser vivo y estoy respirando");
    }
}
