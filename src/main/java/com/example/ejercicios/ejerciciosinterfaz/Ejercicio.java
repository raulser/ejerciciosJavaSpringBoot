package com.example.ejercicios.ejerciciosinterfaz;

public class Ejercicio {
    public static void main(String[] args){
        SerVivo serVivoHumano = new SerHumano();
        SerVivo serVivoAnimal = new Animal();

        serVivoHumano.comer();
        serVivoAnimal.comer();
        serVivoHumano.respirar();
        serVivoAnimal.respirar();
    }
}
