import java.util.Scanner;

public class FichaQ035 {
    public static void main(String[] args) {
        //Peça ao usuário para digitar a sua idade e, em seguida, informe quantos meses e quantos dias ele já
        //viveu (considerando um ano com 365 dias).

        Scanner in = new Scanner(System.in);
        System.out.println("Qual é a sua idade?");
        int idade = in.nextInt();
        int meses = idade * 12;
        int dias = meses * 365;

        System.out.println("anos: " + idade);
        System.out.println("meses: " + meses);
        System.out.println("dias: " + dias);
    }
}
