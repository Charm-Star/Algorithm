import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P6603 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String[] c = br.readLine().split(" ");
            if(!check(c)){
                break;
            }
            int n = Integer.parseInt(c[0]);
            boolean[] visited = new boolean[n];

            int[] arr = new int[c.length-1];

            for (int i = 1; i < c.length; i++) {
                arr[i-1] = Integer.parseInt(c[i]);
            }

            combination(arr,visited,0,n,6);
            System.out.println();


        }



    }
    static void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            print(arr, visited, n);
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
    static boolean check(String[] c){
        if(c[0].equals("0")){
            return false;
        }
        return true;
    }
}
