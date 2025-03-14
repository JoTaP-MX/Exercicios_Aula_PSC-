import java.util.Scanner;

    public class Operações {
        
     public static void main(String[] args){
     
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
         int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
         int numero2 = scanner.nextInt();
        
        int sub = numero1 - numero2;
        int mult= numero1 * numero2;
        int div = numero1 / numero2;

            System.out.println("\n" + sub + "\n" + mult + "\n" + div);
    
   scanner.close();

    }
 }