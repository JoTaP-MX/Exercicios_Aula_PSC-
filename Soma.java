import java.util.Scanner;

    public class Soma {    
        
     public static void main(String[] args){
     
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
         int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
         int numero2 = scanner.nextInt();

        System.out.println("\n" + (numero1 + numero2));
        
        
        
    scanner.close();
     
     }
 }


