import java.util.Scanner;

public class FichaQ030 {
    public static void main(String[] args) {
        //Receba dois números inteiros do usuário e exiba a soma, a diferença, o produto e o quociente
        //(divisão inteira) entre eles.
        int n1, n2, soma, diferença, produto, quociente;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um numero");
        n1 = in.nextInt();
        System.out.println("Insira outro numero");
        n2 = in.nextInt();

        soma = n1 + n2;
        diferença = n1 - n2;
        produto = n1 * n2;
        quociente = n1 / n2;


        System.out.println(soma);
        System.out.println(diferença);
        System.out.println(produto);
        System.out.println(quociente);




    }
}
