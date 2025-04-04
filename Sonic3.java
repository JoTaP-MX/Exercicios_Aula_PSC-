import java.util.Scanner;
public class Sonic3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("    Bem Vindo(a) ao jogo de Sonic 3");
        System.out.println("========================================\n");
        int Esperança = 0, Medo = 0 , Confiança = 0 , Desanimo = 0, Determinação = 0, Incerteza = 0;
        System.out.println("Quantos aliados o Sonic e seus amigos fizeram nessa jornada? ");
        int aliados = leitor.nextInt();
        if (aliados != 0) {
            Esperança = aliados*15;
        }else{
            Medo = 40;
        }
        System.out.println("Vamos para os desafios! Dê uma nota 0 a 10 para cada desafio...\n");
            System.out.println("Digite os pontos para o primeiro desafio: ");
            int desafio1 = leitor.nextInt();
            System.out.println("Digite os pontos para o segundo desafio: ");
            int desafio2 = leitor.nextInt();
            System.out.println("Digite os pontos para o terceiro desafio: ");
            int desafio3 = leitor.nextInt();
            int media = (desafio1 + desafio2 + desafio3) / 3;

            if (media >= 7) {
                Confiança = 60;
            } else {
                Desanimo = 60;
            }
            System.out.println("Vamos para as estratégias de batalha contra o Shadow...\n");
            System.out.println("Quantas estratégias, de 1 a 12, a equipe do sonic conseguiu analisar por completo? ");
            int estrategias = leitor.nextInt();
            Determinação = estrategias * 10;
            int naofeito = 10 - estrategias;
            Incerteza = naofeito * 10;
            int emocoesP = Esperança + Confiança + Determinação;
            int emocoesN = Medo + Desanimo + Incerteza;
            if (emocoesP>emocoesN) {
                System.out.println("Esperança = " + Esperança + "/ Confiança = " + Confiança + "/ Determinação = " + Determinação);
                System.out.println("O Shadow foi derrotado.");
            }else{
                System.out.println("Medo = " + Medo + "/ Desânimo = " +  Desanimo + "/ Incerteza = " +  Incerteza);
                System.out.println("O Shadow venceu o time do Sonic.");
            }
    }
}
