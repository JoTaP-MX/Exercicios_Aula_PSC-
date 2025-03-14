import java.util.Scanner;

    public class Temperatura{
        
     public static void main(String[] args){
     
     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite a temperatura atual: ");
     double temperatura = scanner.nextInt();

     if (temperatura>=25){
        System.out.println("Temperatura " + temperatura + "°C, no momento está quente.");
     }else {
            System.out.println("Temperatura " + temperatura + "°C, no momento está frio");
     }
        
    
    
     scanner.close();
     
    }
}