import java.util.Scanner;

public class FichaQ038 {
    public static void main(String[] args) {
        //Receba três números inteiros digitados pelo usuário e exiba o resultado da operação (n1 + n2) *
        //n3.

        double n1, n2, n3;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o valor");
        n1 = in.nextDouble();
        System.out.println("Insira o valor");
        n2 = in.nextDouble();
        System.out.println("Insira o valor");
        n3 = in.nextDouble();

        double valor = (n1 + n2) * n3;
        System.out.println(valor);
    }
}
