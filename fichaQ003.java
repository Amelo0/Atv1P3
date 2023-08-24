import java.util.Scanner;

//Receba um número inteiro do usuário e converta-o em um número decimal (float).
public class fichaQ003{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um numero!");
        Integer num = in.nextInt();
        float numFloat = num.floatValue();
        System.out.println("O numero é: " + numFloat );

    }
}
