import java.util.Scanner;

public class FichaQ025 {
    public static void main(String[] args) {
        //Solicite ao usuário que insira seu ano de nascimento e concatene-o com uma mensagem de
        //boas-vindas, como "Bem-vindo ao nosso programa, nascido em [ano de nascimento]!".
        Scanner in = new Scanner(System.in);
        System.out.println("Olá! Qual é o ano do seu nascimento?");
        int ano = in.nextInt();
        System.out.println("Seja bem vindo, nascido em " + ano);
    }
}
