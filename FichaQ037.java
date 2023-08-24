import java.util.Scanner;

public class FichaQ037 {
    public static void main(String[] args) {
        //Receba um valor em reais e a cotação do dólar digitados pelo usuário. Em seguida, converta o valor
        //para dólares e exiba o resultado.

        Scanner in = new Scanner(System.in);
        System.out.println("Insira um numero para ser arredondado");
        double reais = in.nextDouble();
        System.out.println("Qual a cotação do dolar?");
        double dolar = in.nextDouble();

        double valor = reais * dolar;
        System.out.println("R$" + valor);
    }
}
