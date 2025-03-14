import java.util.Scanner;

    public class Media_Falta{
        
     public static void main(String[] args){
     
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite primeira nota: ");
         int nota1 = scanner.nextInt();
        System.out.println("Digite segunda nota: ");
         int nota2 = scanner.nextInt();
          int media = (nota1 + nota2) /2;
        System.out.println("Digite numero de faltas: ");
           int falta = scanner.nextInt();
    if (falta>=10){
         System.out.println("Você está reprovado por faltar demais!");
    } else {
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
    }
    
        


  scanner.close();

    }
 }
