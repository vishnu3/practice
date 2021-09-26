package com.tp;

import java.util.ArrayList;
import java.util.List;

public class numTest {
    public static void main(String[] args) {

        printPrime(10);

        printEven(10);

        printOdd(10);

    }

    public static void printPrime(int totalNumber) {
        int count = 0;

        System.out.println("A List of the first " + totalNumber + " prime numbers");

        for (int num = 2; count < totalNumber; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.println(num);
                count++;
            }
        }


    }

    public static void printEven(int num) {
        int count = 0;
        int j = 0;
        List<Integer> evenList = new ArrayList<>();
        while (count < num) {
            if (j % 2 == 0) {
                evenList.add(j);
                count++;
            }
            j++;
        }

        evenList.forEach(System.out::print);

        System.out.println();
    }

    public static void printOdd(int num) {
        int count = 0;
        int j = 0;
        List<Integer> evenList = new ArrayList<>();
        while (count < num) {
            if (j % 2 == 1) {
                evenList.add(j);
                count++;
            }
            j++;
        }

        evenList.forEach(System.out::print);
    }


}
