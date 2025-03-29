
import java.util.Random;
import java.util.Scanner;

public class NumerosMega_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Olá, seja bem-vindo ao sorteio de números!");
        System.out.println("Digite a quantidade de números sorteados: ");
        int quantidadenumeros = sc.nextInt();
        int[] numeros = new int[quantidadenumeros];
        System.out.println("Os números geraos são: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(60);
            for (int j = 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    numeros[i] = random.nextInt(60);
                }
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}
