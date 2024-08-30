import java.util.Locale;
import java.util.Scanner;

public class VerificadorDeLetraA {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu texto para verificar quantas letras 'A' existem nele: ");
        String letraA = scanner.nextLine();

        letraA = letraA.toLowerCase();

        int contagemLetraA = 0;
        for (int letra = 0; letra < letraA.length(); letra++){
            if (letraA.charAt(letra) == 'a'){
                contagemLetraA++;
            }
        }

        System.out.println("A letra 'A' aparece " + contagemLetraA + " vezes no texto!");
    }
}
