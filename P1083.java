import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1083 {
    private static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n];

        String[] temp = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        int s = Integer.parseInt(br.readLine());

        while(s != 0){
            solve(arr);
            s--;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            answer.append(arr[i]).append(" ");
        }
        answer.append(arr[n-1]);
        System.out.println(answer);

    }
    private static void solve(int[] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] < arr[i + 1]){
                int temp = arr[i + 1];
                arr[i + 1] = arr [i];
                arr[i] = temp;
                return;
            }
        }
    }

}
