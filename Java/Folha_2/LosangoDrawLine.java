import java.util.Scanner;
public class LosangoDrawLine {

    static void drawLine(int a , int b){
        for( int j = 0; j < a; j++) System.out.print(".");
        for( int j = 0; j < b; j++) System.out.print("#");
        for( int j = 0; j < a; j++) System.out.print(".");
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i < n ; i+=2){
            drawLine((n - i) / 2 , i);
        }
        for(int i = n ; i > 0; i -= 2 ){
            drawLine((n-i) /2, i);
        }

    }
}
