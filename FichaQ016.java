import java.util.Scanner;

public class FichaQ016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nome?");
        String nome = in.nextLine();
        String[] letras = nome.split("");
        if (letras.length > 5){
            System.out.println("O nome tem mais de 5 caracteres!");

        } else{
            System.out.println("nooooo");

        }
    }
}
