import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P1038{
    static int n;
    static ArrayList<Long> arr = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        if(n <= 10){
            System.out.println(n);
        }
        else if (n > 1022){
            System.out.println(-1);

        }else {
            for (int i = 0; i < 10; i++) {
                dfs(i, 1);
            }
            Collections.sort(arr);

            System.out.println(arr.get(n));
        }
    }

    private static void dfs(long num, int index) {
        if(index > 10){
            return;
        }
        arr.add(num);

        for (int i = 0; i < num % 10; i++) {

            dfs((num * 10) + i,index + 1);
        }

    }
}
