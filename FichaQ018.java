import java.util.Scanner;

public class FichaQ018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira a altura!");
        double altura = in.nextDouble();
        System.out.println("Insira a base!");
        double base = in.nextDouble();
        double area = (base * altura);
        System.out.println("A area é " + area);
    }
}
