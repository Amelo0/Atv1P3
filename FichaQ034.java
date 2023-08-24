import java.util.Scanner;

public class FichaQ034 {
    public static void main(String[] args) {
        //Solicite ao usuário que insira três números decimais. Em seguida, calcule e exiba a média
        //aritmética desses números.
        double n1, n2, n3;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o valor");
        n1 = in.nextDouble();
        System.out.println("Insira o valor");
        n2 = in.nextDouble();
        System.out.println("Insira o valor");
        n3 = in.nextDouble();

        double media = (n1 + n2 + n3) / 3;
        System.out.println(media);
    }
}
