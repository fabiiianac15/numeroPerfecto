package com.mycompany.mavenproject1;

public class Mavenproject1 {

    public static void main(String[] args) {

        System.out.println("Ingrese el número:");
        int numero = 1;
        long inicio = System.nanoTime();

        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
            return;
        }

        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        if (sumaDivisores == numero) {
            System.out.println("El número " + numero + " es un número perfecto.");
        } else {
            System.out.println("El número " + numero + " no es un número perfecto.");
        }

        long fin = System.nanoTime();

        long tiempo = (fin - inicio);

        System.out.println("Tiempo de ejecución: " + tiempo + " nanosegundos");
    }

}
