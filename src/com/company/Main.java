package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main objektas = new Main();
        objektas.ivedimas();
        objektas.isvedimas();
    }

    private int[] masyvas;
    private int suma;

    public void ivedimas() {
        System.out.println("iveskite penkis skaicius");
        Scanner sc = new Scanner(System.in);
        masyvas = new int[5];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("iveskite skaiciu nr.: " + (i + 1));
            masyvas[i] = sc.nextInt();
            suma += masyvas[i];


        }
    }

    public void isvedimas() {
        System.out.println("====================");
        {
            for (int i = 0; i < masyvas.length; i++) {
                System.out.println(masyvas[i]);
            }
        }
    }
}