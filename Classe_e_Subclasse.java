import java.util.Scanner;

public class Classe_e_Subclasse {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, atletas! \n");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade do atleta " + i + ": ");
            int idade = leitor.nextInt();

            if(idade < 6 || idade >20){
            System.out.println("Idade inválida! Insira uma idade entre 6 e 20 anos");
            i--;
            continue;
        }  

        switch (idade) {
            case 6:
            case 7:
                System.out.println("Classificação do atleta é: Sub-7");
                break;
            case 8:
                System.out.println("Classificação do atleta é: Sub-8");
                break;
            case 9:
                System.out.println("Classificação do atleta é: Sub-9");
                break;
            case 10:
            case 11:
                System.out.println("Classificação do atleta é: Sub-11");
                break;
            case 12:
            case 13:
                System.out.println("Classificação do atleta é: Sub-13");
                break;
            case 14:
            case 15:
                System.out.println("Classificação do atleta é: Sub-15");
                break;
            case 16:
            case 17:
                System.out.println("Classificação do atleta é: Sub-17");
                break;
            case 18:
            case 19:
            case 20:
                System.out.println("Classificação do atleta é: Sub-20");
                break;
        }
    }
        leitor.close();
    
    }
}

