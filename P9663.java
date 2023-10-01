import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9663 {

    private static int N ;
    private static int count = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        solve(arr,N,0);

        System.out.println(count);

    }
    private static void solve(int[] arr,int n, int index){


        if(index == N){
            count++;
            return;
        }

        for(int i = 0;i < n ; i++){
            arr[index] = i;
            if(check(arr,index))
                solve(arr,n,index + 1);
        }

    }
    private static boolean check(int[]arr,int index){

        for (int i = 0; i < index; i++) {
            if(arr[index] == arr[i])
                return false;
            else if (Math.abs(index - i) == Math.abs(arr[index] - arr[i])) {
                return false;
            }

        }

        return true;
    }

}
