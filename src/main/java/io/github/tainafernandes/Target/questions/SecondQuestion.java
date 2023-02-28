package io.github.tainafernandes.Target.questions;

import java.util.Scanner;

public class SecondQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        if (verifyFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci");
        }
    }

    public static boolean verifyFibonacci(int number) {
        int fibo1 = 0;
        int fibo2 = 1;
        int fibo3 = 1;
        while (fibo3 < number) {
            fibo1 = fibo2;
            fibo2 = fibo3;
            fibo3 = fibo1 + fibo2;
        }
        if (fibo3 == number) {
            return true;
        } else {
            return false;
        }
    }
}
