import java.util.Scanner;

//Peça ao usuário que digite sua idade em texto (por exemplo, "18") e converta-a em um número
//inteiro.
public class fichaQ002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira sua idade!");
        String idade = in.nextLine();

        int num = Integer.valueOf(idade);
        System.out.println("O numero inteiro é " + num);

    }
}
