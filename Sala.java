import java.util.Scanner;
public class Sala{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a sala que você estuda: ");
        int sala = scanner.nextInt();
        if (sala==317){
        System.out.println("Você está na sala correta: ");
        }else 
        System.out.println("Você está na sala errada: ");
    scanner.close();
}
}