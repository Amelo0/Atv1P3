import java.util.Scanner;
public class FichaQ008 {
    //Solicite ao usuário uma sequência de números separados por espaço e exiba quantos números
    //foram digitados.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira uma sequencia de numeros separados por espaço");
        String numeros = in.nextLine();
        String[] nums = numeros.trim().split("\\s+");
        int quantidade = nums.length;
        System.out.println("Foram digitados " + quantidade + " numeros!");
    }
}
