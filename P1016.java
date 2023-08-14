import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1016 {
    static int answer = 0;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] map = new int[10];

        for (int i = 1; i <= n; i++) {
            String num = String.valueOf(i);

            for (int j = 0; j < num.length(); j++) {
                int number = Integer.parseInt(String.valueOf(num.charAt(j)));

                map[number]++;

            }
        }


        for (int i = 0; i < 10; i++) {
            System.out.print(map[i]+" ");
        }




    }
}
