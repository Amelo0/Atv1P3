import java.util.Scanner;

public class FichaQ026 {
    public static void main(String[] args) {
        //Receba um número inteiro e uma string do usuário. Em seguida, concatene-os em uma única
        //string, separando-os com um espaço.
        int num;
        String str, out;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um numero!");
        num = in.nextInt();

        System.out.println("Insira uma linha!");
        str = in.nextLine();

        out = num + " " + str;
        System.out.println("saida: " + out);


    }
}
