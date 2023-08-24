import java.util.Scanner;

public class FichaQ029 {
    public static void main(String[] args) {

        //Receba uma string contendo um endereço de e-mail e concatene-a com uma mensagem de
        //agradecimento personalizada.

        Scanner in = new Scanner(System.in);
        System.out.println("Olá! Qual é o seu email?");
        String email = in.nextLine();

        String out = "Muito obrigado! Enviaremos o email para " + email;
        System.out.println(out);





    }
}
