import java.util.Scanner;

public class Exemplo4_7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int A, B, C;

        System.out.println("Lado A: ");
        A = input.nextInt();

        System.out.println("Lado B: ");
        B = input.nextInt();

        System.out.println("Lado C: ");
        C = input.nextInt();

        if (A !=0 && B !=0 && C!=0 ) {
            if (A + B > C && A + C > B && B + C > A) {
                if (A != B && A != C && B != C) {
                    System.out.println("Escaleno");
                } else {
                    if (A == B && B == C) {
                    System.out.println("Equilátero");
                    } else { 
                        System.out.println("Isósceles");
                    }
                }
            } else {
                System.out.println("Não forma um triangulo!");
             }
        } else {
            System.out.println("Não forma um triangulo!");
        } 
    }
}
