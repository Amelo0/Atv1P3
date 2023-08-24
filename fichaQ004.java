//Peça ao usuário para digitar dois números inteiros e exiba a soma deles.

import java.util.Scanner;

public class fichaQ004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira dois numeros!");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int soma = (num1 + num2);
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + soma);
    }
}
