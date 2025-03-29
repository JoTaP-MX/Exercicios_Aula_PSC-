
import java.util.Scanner;

public class SenhaUsuario {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String senha = "PROGRAMACAO";
        int tentativas = 3;
        int i = 0;
       while (i<tentativas) {
        System.out.print("Digite a senha de usuário: ");
        String senhaDigitada = leitor.next();
           if (senhaDigitada.equals(senha)){
            System.out.println("Seja bem vindo(a)");
           }else{
            System.out.println("Senha incorreta - ");
            i++;
           }
        if (i==3) {
            System.out.println("Usuário bloqueado!");
        }
       }
    }
}
