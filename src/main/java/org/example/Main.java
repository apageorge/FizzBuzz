package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please provide a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result;
        FizzBuzz fizz = new FizzBuzz();
        for (int i = 1; i <= num; i++) {
            result = fizz.playFizzBuzz(i);
            System.out.println(result);
        }
    }
}