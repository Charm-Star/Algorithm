
import java.util.Scanner;


public class Pascal{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();


        int[][] pascal  = new int[n+1][n+1];

        pascal[1][1] = 1;


        for (int i = 2; i < n+1; i++) {
            for (int j = 1; j <= i; j++) {
                pascal[i][j] = pascal[i-1][j-1]+pascal[i-1][j];
            }
        }


        System.out.println(pascal[n][m]);
//        0.0.0.0.0.0
//        0.1.0.0.0.0
//        0.1.1.0.0.0
//        0.1.2.1.0.0
//        0.1.3.3.1.0
//        0.0.0.0.0.0


    }



}