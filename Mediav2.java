import java.util.Scanner;

    public class Media{
        
     public static void main(String[] args){
     
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
         int nota1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
         int nota2 = scanner.nextInt();
        int media = (nota1 + nota2) /2;
    switch (media){
        case 10: System.out.println("Você está aprovado com EXCELÊNCIA!");
            
            break;
         case 9, 8, 7: System.out.println("Você está aprovado!");
            
            break;
        case 6, 5: System.out.println("Você está de recuperação!");

            break;
        default: System.out.println("Você está reprovado!");
            break;
    }


  scanner.close();

    }
    }
