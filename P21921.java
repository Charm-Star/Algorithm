import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P21921 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0 ;

        for (int i = 0; i < X; i++) {
            sum += arr[i];
        }
        int max = sum;
        int day = 1;
        for (int i = X; i < N; i++) {
            sum -= arr[i - X];
            sum += arr[i];

            if(sum > max){
                day = 0;
                day++;
                max = sum;
            } else if (max == sum) {
                day++;
            }
        }
        if (max == 0) {
            System.out.println("SAD");
            return;
        }


        System.out.println(max);
        System.out.println(day);
    }
}
