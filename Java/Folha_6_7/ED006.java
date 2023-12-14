package Folha_6_7;

import java.util.Scanner;

public class ED006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            int count = scanner.nextLine().split(" ").length;

            int numero_jogadores = scanner.nextInt();

            CircularLinkedList<String> q = new CircularLinkedList<String>();

            for (int j = 0; j < numero_jogadores; j++) {
                q.addLast(scanner.next());
            }

            for (int k = 1; k < numero_jogadores; k++) {
                for (int m = 1; m < count; m++) q.rotate();
                q.removeFirst();
            }

            if (q.getFirst().equals("Carlos"))
                System.out.println("O Carlos nao se livrou");
            else
                System.out.println("O Carlos livrou-se (coitado do " + q.getFirst() + "!)");
        }
    }
}
