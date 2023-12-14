package Folha_3;

import java.util.Date;
import java.util.Scanner;
import java.util.Random;

class Matrix{
    int data[][];
    int rows;
    int cols;

    Matrix(int r , int c){
        data = new int [r][c];
        rows = r;
        cols = c;
    }

    Matrix (int r, int c , int min, int max){
        data = new int [r][c];
        rows = r;
        cols = c;

        Random random = new Random();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <cols; j++){
                data[i][j] = random.nextInt(max-min + 1) + min ;
            }
        }
    }


public void read(Scanner in){
        for(int i = 0; i < rows ; i++)
            for(int j=0; j<cols; j++){
                data[i][j] = in.nextInt();
            }

    }


public String toString(){
        String matrix = "" ;
        for(int i=0; i<rows ; i++){
            for(int j=0; j<cols; j++) {
                matrix += data[i][j] + " ";
            }
            matrix += "\n";
        }
        return matrix;
}

}




public class TestMatrix {

    public static void main(String[] args) {
        Matrix randomMatrix = new Matrix(3, 4, 1, 3);
        System.out.println(randomMatrix.toString());
    }
}
