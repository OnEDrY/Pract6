package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Random r = new Random();
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++)
        {
            mas[i] = r.nextInt(200) + 1;
        }
        for (int i = 0; i < mas.length; i++)
        {
            System.out.println(mas[i]);
        }
     QuickSordt.quickSort(mas,0,9);
        System.out.println("\n\n\n");

        for (int i = 0; i < mas.length; i++)
        {
            System.out.println(mas[i]);
        }
    }
}

