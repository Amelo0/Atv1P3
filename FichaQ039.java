import java.util.Scanner;

public class FichaQ039 {
    public static void main(String[] args) {
        //Peça ao usuário que digite uma temperatura em graus Celsius e a converta para Fahrenheit usando
        //a fórmula: Fahrenheit = (Celsius * 9/5) + 32.

        Scanner in = new Scanner(System.in);
        System.out.println("Entre com uma temperatura");
        double c = in.nextDouble();

        double f = (c * (9/5)) + 32;

        System.out.println(f);


    }
}
