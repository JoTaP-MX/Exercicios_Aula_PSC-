
import java.util.Scanner;

public class Alegria_Tristeza {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Bem Vindo(a) ao jogo de emoções da Riley");
        System.out.println("========================================\n");
        int alegria = 0;
        int tristeza = 0;
        System.out.println("Riley fez alguma nova amizade nesta nova cidade?\nMarque 1 para sim e 2 para não: ");
        int amizade = leitor.nextInt();
        switch (amizade) {
            case 1:
                System.out.println("Quantas amizades Riley fez? ");
                int quantamizades = leitor.nextInt();
                alegria = quantamizades * 10;
            case 2:
                tristeza = 30;
            default:
                System.out.println("Você digitou uma opção inválida. Tente novamente!");
        }
        System.out.println("Digite a porcentagem de presença da Riley nas aulas: ");
        int presença = leitor.nextInt();
        if (presença < 25) {
            tristeza = tristeza + 50;
        } else {
            System.out.println("Digite a nota da A1: ");
            int nota1 = leitor.nextInt();
            System.out.println("Digite a nota da A2: ");
            int nota2 = leitor.nextInt();
            System.out.println("Digite a nota da A3: ");
            int nota3 = leitor.nextInt();
            int media = (nota1 + nota2 + nota3) / 3;

            if (media >= 7) {
                alegria = alegria + 50;
            } else {
                tristeza = tristeza + 50;
            }
        }
        System.out.println("Quantos exercícios de programação Riley conseguiu fazer? ");
        int exercicios = leitor.nextInt();
        alegria = alegria + (exercicios * 10);
        int naofeito = 10 - exercicios;
        tristeza = tristeza + (naofeito * 10);
        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }
       leitor.close();
    }
}
