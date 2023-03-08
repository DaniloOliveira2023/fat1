import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 0;
        int fatorial = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número");
        numero = s.nextInt();
        if (numero > 0) {
            for (int i = numero; i > 1; i--) {
                fatorial = fatorial * i;
            }
            System.out.println("O valor do fatorial é " + fatorial);
        }
        else {
            System.out.println("Não existe fatorial de número negativo");
        }
    }
}
