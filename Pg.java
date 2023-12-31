
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Pg {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N + 1];
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }


    }

}
