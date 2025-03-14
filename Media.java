import java.util.Scanner;

    public class Media{
        
     public static void main(String[] args){
     
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
         int nota1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
         int nota2 = scanner.nextInt();
        double media = (nota1 + nota2) /2;
     if (media>=7){
        System.out.println("Você está aprovado!");
     }else {
        System.out.println("Você está Reprovado!");
     }



  scanner.close();

    }
 }
