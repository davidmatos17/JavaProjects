import java.util.Scanner;
public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] NewLine = new String[n];


        for (int i = 0; i < n; i++) {
            NewLine[i] = scanner.nextLine();

        }
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            if (isPalindrome(NewLine[i])) {
                System.out.println("sim");
            } else {
                System.out.println("nao");
            }
        }
        scanner.close();
    }

    static boolean isPalindrome(String frase) {
        frase = frase.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int esquerda = 0;
        int direita = frase.length() - 1;
        while (esquerda < direita) {
            if (frase.charAt(esquerda) != frase.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }

}