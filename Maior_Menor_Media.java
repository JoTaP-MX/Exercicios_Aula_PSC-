import java.util.Scanner;

    public class Maior_Menor_Media{
      
     public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
       int maior, menor;

        System.out.println("Digite um numero: " + "\n");
         int numero1 = scanner.nextInt();
        System.out.println("Digite um segundo numero: " + "\n");
         int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: " + "\n");
         int numero3 = scanner.nextInt();
      double media = (numero1 + numero2 + numero3) /3.0;
     

      if (numero1>numero2 && numero1>numero3) {
        maior = numero1;
      } else if (numero2>numero3 && numero2>numero1) {
          maior = numero2;
        } else {
          maior = numero3;
        }
      
      
      System.out.println("\n O maior numero é: " + maior);

      if (numero1<numero2 && numero1<numero3) {
        menor = numero1;
      } else if (numero2<numero3 && numero2<numero1) { 
          menor = numero2;
        } else {
          menor = numero3;
        }
        
      
      
      System.out.println("\n O menor numero é: " + menor);

      System.out.printf("\n A média entre os número é: %.2f",media);



      scanner.close();
}
    }
      

    
    

    
        

    
        