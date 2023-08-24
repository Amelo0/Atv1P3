import java.util.Scanner;
public class fichaQ005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um numero decimal!");
        double num = in.nextDouble();
        double numSqr = (num * num);
        System.out.println("O quadrado dele é: " + numSqr);
    }
}
