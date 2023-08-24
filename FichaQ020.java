import java.util.Scanner;

public class FichaQ020 {
    public static void main(String[] args) {
        //20. Solicite ao usuário que insira dois números decimais e calcule o resto da divisão entre eles.
        double n1, n2, resto;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um numero");
        n1 = in.nextDouble();
        System.out.println("Insira outro numero");
        n2 = in.nextDouble();
        resto = n1 % n2;

        System.out.println("O resto é: " + resto);

    }
}
