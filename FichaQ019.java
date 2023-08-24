import java.util.Scanner;
public class FichaQ019 {
    public static void main(String[] args) {
    //Peça ao usuário que digite a sua cidade e verifique se ela começa com a letra "S" (ou outra letra de//sua escolha).

        Scanner in = new Scanner(System.in);
        System.out.println("Qual a sua cidade?");
        String cidade = in.nextLine();
        char s = cidade.charAt(0);
        if ((s == 'S') || (s== 's')){
            System.out.println("Começa com S!");
        }else {
            System.out.println("Não começa com S");
        }
    }
}
