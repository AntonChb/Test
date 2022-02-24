package com.example.dodo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Controller {

    public void mm() {

        int[] a = new int[5];
        int i = 0;
        Scanner in = new Scanner(System.in);

        for (int element : a) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            a[i] = in.nextInt();

            System.out.println("Введено - " + a[i]);

            i++;
        }

        System.out.println("\nВсего по порядку - " + Arrays.toString(a));
        System.out.print("\nСортирую: \n");
        Arrays.sort(a);
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k] + " ");
        }

        List m= Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(m);
//просто
    }
}