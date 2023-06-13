package org.example;

import java.math.BigDecimal;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o valor do capital investido:");
        float capital = teclado.nextFloat();
        System.out.println("Digite a taxa de juros anual:");
        float taxa = teclado.nextFloat();
        System.out.println("Digite o período do investimento em anos:");
        byte periodo = teclado.nextByte();

        // Processamento
        taxa /= 100;
        BigDecimal montante = BigDecimal.valueOf(capital * Math.pow(1+taxa,periodo));

        // Saída
        System.out.printf("O montante do investimento é de R$ %.2f",montante);
    }
}
