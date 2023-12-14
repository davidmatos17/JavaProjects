import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Estatisticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        float soma = 0;
        int[] lista = new int[n];
        int maximo = -1000000;
        int min = 1000000;
        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextInt();
            soma += lista[i];
            if (lista[i] > maximo) {
                maximo = lista[i];
            }
            if (lista[i] < min) {
                min = lista[i];
            }
        }

        float media = soma / n;

        // Create a DecimalFormat object with the desired format
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("0.00", symbols);

        // Format the media value with a dot as the decimal separator
        String formattedMedia = decimalFormat.format(media);

        System.out.println(formattedMedia);
        System.out.println(maximo - min);

        scanner.close();
    }
}
