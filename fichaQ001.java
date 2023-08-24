import java.io.InputStream;
import java.lang.String;
import java.util.Scanner;

public class fichaQ001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Olá! Qual é o seu nome?");
        String nome = in.nextLine();
        System.out.println("Seja bem vindo, " + nome +"!");

    }
}
