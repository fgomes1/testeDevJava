package com.algaworks.d;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        int a = 0, b = 1, c;

        System.out.print("Sequência de Fibonacci: " + a + ", " + b);

        while (b <= numero) {
            c = a + b;
            System.out.print(", " + c);
            if (c == numero) {
                System.out.print("\nO número " + numero + " pertence à sequência de Fibonacci.");
                return;
            }
            a = b;
            b = c;
        }

        System.out.print("\nO número " + numero + " não pertence à sequência de Fibonacci.");
    }
}
