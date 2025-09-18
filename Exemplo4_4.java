import java.util.Scanner;

public class Exemplo4_4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2, soma;
        
        System.out.println("Qual o primeiro valor?");
        valor1 = input.nextInt();

        System.out.println("Qual o segundo valor?");
        valor2 = input.nextInt();

        soma = valor1 + valor2;

        System.out.println("Resultado: " + soma);

        input.close();
    }
}
