import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        byte a = teclado.nextByte();
        System.out.println("Digite o segundo número:");
        byte b = teclado.nextByte();
        System.out.println("Digite o terceiro número:");
        byte c = teclado.nextByte();
        System.out.println("Digite o quarto número:");
        byte d = teclado.nextByte();

        if(b > c && d > a && c+d > a+b && c > -1 && d > -1 && a % 2 == 0)
            System.out.println("Valores aceitos!!!");
        else
            System.out.println("Valores não aceitos!!!");
    }
}
