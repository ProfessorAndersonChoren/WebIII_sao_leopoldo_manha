package org.example;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o valor do raio:");
        byte raio = teclado.nextByte();

        // Processamento
        double area = Math.PI * raio * raio;

        // Saída
        System.out.printf("A = %.4f",area);
    }
}