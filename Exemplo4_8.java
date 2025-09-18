import java.util.Scanner;

public class Exemplo4_8 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String codigo;
        
        System.out.println("Digite o código: ");
        codigo = input.nextLine();

        switch (codigo) {
            case "001": System.out.println("O Produto é Caderno.");
            break;
            case "002": System.out.println("O Produto é Lápis.");
            break;
            case "003": System.out.println("O produto é Borracha.");
            break;
            default: System.out.println("Diversos.");
        }
        input.close();
    }
}
