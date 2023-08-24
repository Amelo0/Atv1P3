import java.util.Scanner;

public class FichaQ033 {
    public static void main(String[] args) {
        //Receba a base e a altura de um retângulo digitados pelo usuário. Em seguida, calcule e exiba o
        //perímetro do retângulo.

        double base, altura;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o valor da base");
        base = in.nextDouble();
        System.out.println("Insira o valor da altura");
        altura = in.nextDouble();

        double per = 2 * (base + altura);
        System.out.println(per);

    }
}
