import java.util.Scanner;

public class FichaQ028 {
    //Receba um número inteiro do usuário e concatene-o com uma mensagem, informando o dobro
    //desse número.
    public static void main(String[] args) {
        int num;
        String out;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um numero!");
        num = in.nextInt();

        out = "O dobro de " + num + " é " + 2*num + "!";

        System.out.println(out);

    }
}
