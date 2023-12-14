import java.util.Scanner;

public class Primes{
    static boolean[] crivos (int n){
        boolean[] crivo = new boolean [n + 1];
        for (int i = 2; i <= n; i++){
            crivo[i] = true;    // cria uma lista de valores booleanos de tamanho n com valores true
        }

        for(int j = 2; j*j <= n ; j++){
            if (crivo[j]){
                for(int i = j*j; i<=n ; i+=j){
                    crivo[i] = false;
                }
            }
        }
        return crivo;

    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int primeiro = scanner.nextInt();
        int segundo = scanner.nextInt();
        boolean[] crivo = crivos(segundo);
        int soma = 0;
        for (int i=primeiro ; i<=segundo; i++)
            if (crivo[i]){
                soma += 1;
            }
        System.out.println(soma);
        scanner.close();
    }
}
