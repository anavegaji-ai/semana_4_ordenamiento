package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(50);
        nums.add(36);
        nums.add(60);

        int suma = 0;
        for (int numero : nums) {
            suma += numero;
        }
        System.out.println("La suma de los nums es: " + suma);

        for (int num : nums) {
            System.out.println(num);
        }
        for (int i = 0; i< nums.size(); i++){
            System.out.println(i + " : " + nums.get(i));

        }
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("valentina");
        nombres.add("camila");
        nombres.add("anderson");
        nombres.add("lucia");


        System.out.println("for");
        for(int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        {
            System.out.println("for each:");
            for(String nombre : nombres);
            System.out.println(nombres);
        }

        System.out.println("while:");
        int i = 0;
        while (i < nombres.size())
        {
            System.out.println(nombres.get(i));
            i++;

        }
    }
}