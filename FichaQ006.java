import java.util.Scanner;

public class FichaQ006 {
    //Peça ao usuário que insira o seu ano de nascimento e, em seguida, exiba a sua idade.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o ano em que você nasceu!");
        int ano = in.nextInt();
        int idade = (2023 - ano);
        System.out.println("Você tem " + idade + " de idade!");
    }
}
