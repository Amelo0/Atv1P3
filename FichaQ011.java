import java.util.Scanner;

public class FichaQ011 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Insira uma String!");
        String numeros = in.nextLine();
        String[] nums = numeros.split("");
        int quantidade = nums.length;
        System.out.println("Foram digitados " + quantidade + " caracteres!");
    }
}
