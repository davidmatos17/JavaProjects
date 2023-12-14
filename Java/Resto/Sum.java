// Importa a classe Scanner, que será usada para leitura de dados
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        int a = stdin.nextInt();
        int b = stdin.nextInt();

        System.out.println(a+b);
    }

}