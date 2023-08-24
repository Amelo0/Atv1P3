import java.util.Scanner;

public class FichaQ027 {
    public static void main(String[] args) {
//Receba o nome de um produto digitado pelo usuário e concatene-o com o preço do produto,
//adicionando o símbolo de moeda da sua escolha.
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um produto");
        String produto = in.nextLine();
        double custo = 2.50;
        String out = produto + " Custa :" + " R$" + custo + "!";
        System.out.println(out);

    }
}
