import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.List;

public class P1759 {

    private static int N;
    private static int INPUT_LENGTH;
    private static List<String> checkArr = List.of("a","e","i","o","u");
    private static String[] INPUT_ARR;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input  = br.readLine().split(" ");

        N = Integer.parseInt(input[0]);
        INPUT_LENGTH = Integer.parseInt(input[1]);
        INPUT_ARR = br.readLine().split(" ");

        Arrays.sort(INPUT_ARR);

        boolean[] visited = new boolean[INPUT_LENGTH];
        combination(INPUT_ARR,visited,0,INPUT_LENGTH,N);






    }
    static void combination(String[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0 && check(arr,visited,n)) {
            print(arr, visited, n);
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
    static void print(String[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
    static boolean check(String arr[],boolean[] visited, int n){

        int jCount = 0;
        int mCount = 0;
        for (int i = 0; i < n; i++) {
            if(visited[i] && checkArr.contains(arr[i])){
                mCount++;
            }else if(visited[i] && !checkArr.contains(arr[i])){
                jCount++;
            }
        }
        if(jCount >= 2 && mCount >= 1)
            return true;

        return false;
    }
}


