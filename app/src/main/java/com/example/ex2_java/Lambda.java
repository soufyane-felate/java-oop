package com.example.ex2_java;

import java.util.function.IntPredicate;

public class Lambda {

    public static IntPredicate estPositif = x -> x > 0;

    public static int somTable(int[] tableau, IntPredicate condition) {
        int somme = 0;
        for (int nombre : tableau) {
            if (condition.test(nombre)) {
                somme += nombre;
            }
        }
        return somme;
    }

    public static void main(String[] args) {
        int[] tableau = { -2, 5, -8, 10, 3, -1, 7, 4 };

        int sommePositif = somTable(tableau, estPositif);
        System.out.println("Somme des entiers positifs : " + sommePositif);


        int sommePairs = somTable(tableau, x -> x % 2 == 0);
        System.out.println("Somme des entiers pairs : " + sommePairs);
    }
}
