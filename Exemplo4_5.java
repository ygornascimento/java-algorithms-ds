import java.util.Scanner;

public class Exemplo4_5 {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        int numero;
        
        System.out.println("Numero: ");
        numero = input.nextInt();

        if (numero % 2 == 1) {
            System.out.println("O número é impar."); 
        }
    }
}
