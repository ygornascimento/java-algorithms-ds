import java.util.Scanner;

public class Exemplo4_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salario, bonus;
        int tempo;

        System.out.println("Salário: ");
        salario = input.nextFloat();

        System.out.println("Tempo na empresa: ");
        tempo = input.nextInt();

        if (tempo >= 5) {
            bonus = salario * 0.20F;
        } else {
            bonus = salario * 0.10F;
        }

        System.out.println("O valor do bônus é R$: " + bonus);
    }
}
