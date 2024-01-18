import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1717 {
    static int[] arr ;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        String[] input  = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        arr = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            arr[i] = i;
        }


        for(int i = 0 ; i < m ; i++){
            String[] order = br.readLine().split(" ");
            int num1 = Integer.parseInt(order[1]);
            int num2 = Integer.parseInt(order[2]);
            if(order[0].equals("0")){
                union(num1,num2);
            }else {
                if(find(num2) == find(num1)){
                    stringBuilder.append("YES\n");
                }else{
                    stringBuilder.append("NO\n");
                }
            }
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.println(find(i));
        }
        System.out.println(stringBuilder);

    }

    private static int find(int x) {
        if (x == arr[x]) {
            return x;
        }

        return  find(arr[x]);
    }

    private static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x != y) {
            if (x < y) {
                arr[y] = x;
            } else {
                arr[x] = y;
            }
        }
    }


}
