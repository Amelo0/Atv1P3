import java.util.Scanner;

public class FichaQ031 {
    public static void main(String[] args) {
        //Peça ao usuário para digitar a base e a altura de um triângulo. Em seguida, calcule e exiba a área do
        //triângulo.

        double base, altura;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o valor da base");
        base = in.nextDouble();
        System.out.println("Insira o valor da altura");
        altura = in.nextDouble();

        double area = (base * altura) / 2;
        System.out.println(area);



    }
}
