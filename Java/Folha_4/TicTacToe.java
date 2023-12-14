import java.util.Scanner;
class Game {
    private int n;
    private char[][] m;

    Game(int size) {
        n = size;
        m = new char[n][n];
    }

    void read(Scanner in) {
        for (int i = 0; i < n; i++) {
            String buf = in.next();
            for (int j = 0; j < n; j++) {
                m[i][j] = buf.charAt(j);
            }
        }
    }

    void verify(int y, int x, int incy, int incx) {
        if (m[y][x] == '.') return;
        for (int i = 0, yy = y, xx = x   ;   i < n   ;    i++, yy += incy, xx += incx) {
            if (m[y][x] != m[yy][xx]) return;
        }
        win(m[y][x]);
    }

    void win(char player) {
        System.out.println("Ganhou o " + player);
        System.exit(0); // Sai do programa
    }

    void check() {
        for (int i = 0; i < n; i++) verify(i, 0, 0, 1); // Linhas
        for (int j = 0; j < n; j++) verify(0, j, 1, 0); // Colunas
        verify(0, 0, 1, 1); // Diagonal 1
        verify(0, n - 1, 1, -1); // Diagonal 2
        if (!finished()) System.out.println("Jogo incompleto");    // !finished  (not finished)
        else System.out.println("Empate");
    }

    // Devolve true se o jogo j´a terminou ou false caso contr´ario
    boolean finished() {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (m[i][j] == '.') return false;
        return true;
    }
}
public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Game g = new Game(n);
        g.read(scanner);
        g.check();
    }
}
