import java.util.Scanner;


public class Scanners {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Whats your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
