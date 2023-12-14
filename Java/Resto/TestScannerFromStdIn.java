import java.util.Scanner;
public class TestScannerFromStdIn {


        public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in);
            System.out.println("Number of persons: ");
            int n = stdIn.nextInt();
            String[] names = new String[n];
            int[] ages = new int[n];

            for (int i = 0; i < n; i++) {

                names[i] = stdIn.next();
                ages[i] = stdIn.nextInt();
            }

            for (int i = 0; i < n; i++) {
                System.out.println("name: " + names[i] + " age: " + ages[i]);
            }
        }
    }

