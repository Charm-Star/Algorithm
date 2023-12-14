import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1940 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int M = Integer.parseInt(br.readLine());

        int answer = 0;
        int[] arr = new int[N];
        String[] input = br.readLine().split(" ");
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        for(int i = 0; i < N-1 ;i++){
            for (int j = i + 1; j < N ; j++){
                if(arr[i] + arr[j] == M) answer++;
            }
        }
        System.out.println(answer);




    }


}
