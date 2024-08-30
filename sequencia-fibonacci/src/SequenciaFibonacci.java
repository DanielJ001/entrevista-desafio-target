import java.util.Locale;
import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe um número para verificar se ele pertence a senquência de Fibonacci");
        int numero = scanner.nextInt();
        
        int a = 0;
        int b = 1;

        while (b < numero) {
            int c = a;
            a = b;
            b = c + b;
        }

        if (b == numero) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci!");
        }
    }
}