import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2566 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] map = new int[9][9];

        for (int i = 0; i < 9; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
            map[i][j] = Integer.parseInt(input[j]);
            }
        }

        int answer = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(answer<map[i][j]){
                    answer = map[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(answer);
        System.out.println(x+" "+y);

    }


}
