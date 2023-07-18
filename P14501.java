import java.io.*;
import java.util.*;

public class P14501 {
    static int t[];
    static int p[];
    static int n;
    static int ans = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        t = new int[n];
        p = new int[n];

        for(int i=0; i<n; i++) {
            StringTokenizer st  = new StringTokenizer(br.readLine());

            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
        work(0,0);

        System.out.println(ans);

    }

    public static void work(int index, int sum) {

        if(index == n) {
            if(ans < sum){
                ans = sum;
            }
            return;
        }

        if(index > n) return;

        work(index + t[index], sum+p[index]);

        work(index+1, sum);

    }
}