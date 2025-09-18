import java.util.Scanner;

public class Exemplo4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        String name;
        System.out.println("Qual é o seu nome? ");
        name = input.nextLine();
        
        System.out.println("Seu nome é: " + name);
        
        input.close();
    }
}
