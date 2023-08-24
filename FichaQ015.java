import java.util.Scanner;

public class FichaQ015 {
    public static void main(String[] args) {
        //Receba a altura e o peso de uma pessoa digitados pelo usuário. Em seguida, calcule o seu índice de
        //massa corporal (IMC) utilizando a fórmula: IMC = peso / (altura * altura) e exiba o resultado.

        Scanner in = new Scanner(System.in);
        System.out.println("Insira a sua altura!");
        double altura = in.nextDouble();
        System.out.println("Insira seu peso!");
        double peso = in.nextDouble();

        double imc = (peso / (altura * altura) );
        System.out.println("O IMC é: " + imc);

    }
}
