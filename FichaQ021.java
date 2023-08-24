import java.util.Scanner;

public class FichaQ021 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Insira um numero");
        double n1;
        n1 = in.nextDouble();

        int num = (int)Math.round(n1);
        System.out.println(num);
    }
}
