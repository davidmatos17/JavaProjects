import java.util.Scanner;


public class ReadNumbers {

    // Escrever os numeros guardados num array no stdout
    static void writeArray(int v[]) {
        for (int i=0; i<v.length; i++)
            System.out.println("v[" + i + "] = " + v[i]);
    }


    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);


        int v[] = new int[10];     // Cria um novo array com espaço para 10 inteiros
        int n = stdin.nextInt();  // Ler a quantidade de numeros que se seguem

        int min = 2147483647;
        int max = -2147483648;

        for (int i=0; i<n; i++) {   // Ler os numeros a partir do stdin
            v[i] = stdin.nextInt();
            if (v[i] > max) {
                max = v[i];
            }
            if (v[i] < min) {
                min = v[i];
            }
        }

        writeArray(v);// Chamar procedimento que escreve


        int amplitude = max - min;
        System.out.println(amplitude);
    }
}

