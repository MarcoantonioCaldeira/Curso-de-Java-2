import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite a senha");
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while(senha != 2002){
            System.out.println("Senha invalida");
            senha = sc.nextInt();
        }

        System.out.println("Usuario liberado");

        sc.close();
    }
}