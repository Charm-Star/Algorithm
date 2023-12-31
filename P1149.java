import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P1149 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        int[][] cost = new int[N][3];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            cost[i][0] = Integer.parseInt(input[0]);
            cost[i][1] = Integer.parseInt(input[1]);
            cost[i][2] = Integer.parseInt(input[2]);

        }


        for (int i = 1; i < N; i++) {
            cost[i][0] += Math.min(cost[i - 1][1], cost[i - 1][2]);
            cost[i][1] += Math.min(cost[i - 1][0], cost[i - 1][2]);
            cost[i][2] += Math.min(cost[i - 1][0], cost[i - 1][1]);
        }

        System.out.println(Math.min(Math.min(cost[N - 1][0], cost[N - 1][1]), cost[N - 1][2]));
    }

}