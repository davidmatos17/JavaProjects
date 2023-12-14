import java.util.Scanner;

public class Losango {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        prints(n);
    }

    static void prints(int n) {
        char space = '.';
        char star = '#';
        int metade = n / 2;
        for (int i = 0; i < metade; i++) {
            for (int j = 0; j < metade-i; j++) {
                System.out.print(space);
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(star);
            }
            for ( int l = metade-i; l >= 1; l--){
                System.out.print(space);
            }
            System.out.println();
        }


        for (int i = metade; i >= 0; i--) {
            for (int j = 0; j < metade - i; j++) {
                System.out.print(space);
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(star);
            }

            for ( int l = metade-i; l >= 1; l--) {
                System.out.print(space);
            }
            System.out.println();

        }

    }
}






