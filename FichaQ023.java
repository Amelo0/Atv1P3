import java.util.Scanner;

public class FichaQ023 {
    public static void main(String[] args) {
        //Solicite ao usuário que digite uma data no formato "dd/mm/aaaa" e extraia o dia, o mês e o ano
        //separadamente, convertendo-os em números inteiros.
        Scanner in = new Scanner(System.in);

        System.out.println("Insira uma data no formato dd/mm/aaaa");
        String data = in.nextLine();

        String[] nums = data.split("/");

        if (nums.length != 3){
            System.out.println("Formato de data invalido");
        }else {
            int dia = Integer.parseInt(nums[0]);
            int mes = Integer.parseInt(nums[1]);
            int ano = Integer.parseInt(nums[2]);

            System.out.println("Dia: " + dia);
            System.out.println("Mês: " + mes);
            System.out.println("Ano: " + ano);
        }
    }
}
