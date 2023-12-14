import java.util.Scanner;
public class Primos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de 'a': ");
        int a = input.nextInt();
        System.out.print("Digite o valor de 'b': ");
        int b = input.nextInt();

        int contadorPrimos = contarPrimosEntreAeB(a, b);

        System.out.println("Quantidade de números primos entre " + a + " e " + b + ": " + contadorPrimos);

        input.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        if (numero <= 3) {
            return true;
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static int contarPrimosEntreAeB(int a, int b) {
        int contador = 0;

        for (int numero = a; numero <= b; numero++) {
            if (ehPrimo(numero)) {
                contador++;
            }
        }

        return contador;
    }

}
