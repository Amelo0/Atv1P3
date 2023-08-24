import java.util.Scanner;

public class FichaQ036 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um numero para ser arredondado");
        double num = in.nextDouble();

        int round = (int) Math.round(num);
        System.out.println(round);



    }
}
