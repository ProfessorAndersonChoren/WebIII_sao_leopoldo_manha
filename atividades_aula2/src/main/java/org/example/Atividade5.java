package org.example;
import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite a velocidade constante em m/s:");
        byte velocidade = teclado.nextByte();
        System.out.println("Digite o tempo decorrido em dias:");
        short tempo = teclado.nextShort();

        // Processamento
        tempo *=  24; // tempo = tempo * 24
        velocidade *= 3.6; // velocidade = velocidade * 3.6
        float posicaoFinal = velocidade * tempo;

        // Saída
        System.out.printf("Sf = %.0fkm",posicaoFinal);
    }
}
