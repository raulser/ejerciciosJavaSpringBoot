package com.example.ejercicios.ejerciciosinterfaz;

public class Animal implements SerVivo{
    @Override
    public void comer() {
        System.out.println("Soy un animal y estoy comiendo");
    }
}
