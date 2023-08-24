import java.util.Scanner;

public class FichaQ010 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = in.nextLine();
        System.out.println("Qual seu sobrenome?");
        String sobrenome = in.nextLine();
        String vulgo = (sobrenome + nome);
        System.out.println("Você se chama: " + sobrenome + ", " + nome);

    }
}
