import java.util.Scanner;

public class gpt {
    static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiro = scanner.nextInt();
        int segundo = scanner.nextInt();
        boolean[] isPrime = sieveOfEratosthenes(segundo);

        int soma = 0;
        for (int i = primeiro; i <= segundo; i++) {
            if (isPrime[i]) {
                soma += 1;
            }
        }

        System.out.println(soma);
        scanner.close();
    }
}

