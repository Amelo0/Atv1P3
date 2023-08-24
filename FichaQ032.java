import java.util.Scanner;

public class FichaQ032 {
    public static void main(String[] args) {
        //Receba o raio de uma circunferência digitado pelo usuário e calcule o seu perímetro (2 * π * raio).

        Scanner in = new Scanner(System.in);
        System.out.println("Qual o raio da circumferencia?");
        double raio = in.nextDouble();

        double circ = 2 * Math.PI * raio;
        System.out.println(circ);

    }
}
