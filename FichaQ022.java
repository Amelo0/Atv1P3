import java.util.Scanner;

public class FichaQ022 {
    public static void main(String[] args) {
        //Receba uma string contendo um número inteiro e some 10 a esse número, convertendo-o
        //novamente para uma string antes de exibi-lo.
        Scanner in = new Scanner(System.in);
        String linha;
        System.out.println("Insira um numero");
        linha = in.nextLine();

        int num = Integer.valueOf(linha);
        num = num +10;

        String out = Integer.toString(num);
        System.out.println(out);
    }
}
