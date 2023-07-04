import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do lado A");
        byte ladoA = teclado.nextByte();
        System.out.println("Digite o valor do lado B");
        byte ladoB = teclado.nextByte();
        System.out.println("Digite o valor do lado C");
        byte ladoC = teclado.nextByte();

        var quadradoLadoA = Math.pow(ladoA, 2);
        var quadradoLadoB = Math.pow(ladoB, 2);
        var quadradoLadoC = Math.pow(ladoC, 2);

        if (ladoA < ladoB || ladoA < ladoC)
            System.out.println("Números inválidos!!!");
        else {
            if (ladoA >= ladoB + ladoC)
                System.out.println("NÃO FORMA UMA TRIÂNGULO!!!");
            else{
                // 1° Descobrir o tipo
                if(quadradoLadoA > quadradoLadoB + quadradoLadoC)
                    System.out.println("TRIÂNGULO OBTUSÂNGULO");
                else if(quadradoLadoA < quadradoLadoB + quadradoLadoC)
                    System.out.println("TRIANGULO ACUTÂNGULO");

                // 2° Descrobrir o subtipo
                if(quadradoLadoA == quadradoLadoB + quadradoLadoC)
                    System.out.println("TRIÂNGULO RETÂNGULO");
                else if(ladoA == ladoB && ladoA == ladoC && ladoB == ladoC)
                    System.out.println("TRIÂNGULO EQUILÁTERO");
                else
                    System.out.println("TRIÂNGULO ISÓCELES");
            }
        }
    }
}
