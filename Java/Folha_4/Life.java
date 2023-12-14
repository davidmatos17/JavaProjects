/* -----------------------------------
  Estruturas de Dados 2023/2024
  Jogo da Vida [ED088]
----------------------------------- */

import java.util.Scanner;

// Classe para representar um jogo
class LifeGame {
    final char DEAD  = '.';                                                                                             // Constante que indica uma celula morta
    final char ALIVE = 'O';                                                                                             // Constante que indica uma celula viva
    private int rows, cols;                                                                                             // Numero de linhas e colunas
    private char m[][];                                                                                                 // Matriz para representar o estado do jogo

    // Construtor: inicializa as variaveis tendo em conta a dimensao dada
    LifeGame(int r, int c) {
        rows = r;
        cols = c;
        m = new char[r][c];
    }

    // Metodo para ler o estado inicial para a matriz m[][]
    public void read(Scanner in) {
        for (int i=0; i<rows; i++)
            m[i] = in.next().toCharArray();
    }

    // Metodo para escrever a matriz m[][]
    public void write() {
        for ( int i = 0 ; i < rows ;i++){
            for(int j = 0; j < cols ; j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }

    // Deve devolver o numero de celulas vivas que sao vizinhas de (y,x)
    private int countAlive(int y, int x) {
        int count = 0;

        // Define relative positions of neighboring cells
        int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};

        for (int i = 0; i < 8; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            // Check if the neighbor is within bounds and alive
            if (ny >= 0 && ny < rows && nx >= 0 && nx < cols && m[ny][nx] == ALIVE) {
                count++;
            }
        }

        return count;
    }

    // Deve fazer uma iteracao: cria nova geracao a partir da actual
    public void iterate() {
        char[][] newGrid = new char[rows][cols];

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                int aliveNeighbors = countAlive(y, x);

                if (m[y][x] == ALIVE) {
                    if (aliveNeighbors < 2 || aliveNeighbors > 3) {
                        newGrid[y][x] = DEAD;
                    } else {
                        newGrid[y][x] = ALIVE;
                    }
                } else {
                    if (aliveNeighbors == 3) {
                        newGrid[y][x] = ALIVE;
                    } else {
                        newGrid[y][x] = DEAD;
                    }
                }
            }
        }

        m = newGrid;
    }

}

// Classe principal com o main()
public class Life {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ler linhas, colunas e numero de iteracoes
        int rows = in.nextInt();
        int cols = in.nextInt();
        int  n   = in.nextInt();

        // Criar objecto para conter o jogo e ler estado inicial
        LifeGame game = new LifeGame(rows, cols);
        game.read(in);

        for(int i = 0; i < n ; i++){
            game.iterate();
        }
        game.write();
    }
}
