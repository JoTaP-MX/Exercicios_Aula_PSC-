import java.util.Random;

public class NumerosMega_1 {

    public static void main(String[] args) {
        System.out.println("Olá, seja bem-vindo ao sorteio de números!");

        Random sorteio = new Random();
        int menor = 1;
        int maior = 60;

        int numero1 = sorteio.nextInt((maior - menor) + 1) + menor;
        int numero2 = sorteio.nextInt((maior - menor) + 1) + menor;
        int numero3 = sorteio.nextInt((maior - menor) + 1) + menor;
        int numero4 = sorteio.nextInt((maior - menor) + 1) + menor;
        int numero5 = sorteio.nextInt((maior - menor) + 1) + menor;
        int numero6 = sorteio.nextInt((maior - menor) + 1) + menor;

        System.out.printf("Os números sorteados foram: %d, %d, %d, %d, %d, %d", 
            numero1, numero2, numero3, numero4, numero5, numero6);
    }
}