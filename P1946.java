import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class P1946 {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        while(n != 0){

            int length = Integer.parseInt(br.readLine());

            int [][] arr = new int[length][2];

            for (int i = 0; i < length; i++) {
                String[] temp  = br.readLine().split(" ");
                arr[i][0] = Integer.parseInt(temp[0]);
                arr[i][1] = Integer.parseInt(temp[1]);
            }

            Arrays.sort(arr, Comparator.comparingInt(arr2 -> arr2[0]));


            int ans = 1;
            int min =arr[0][1];
            for(int i = 1; i < length; i++) {
                if(arr[i][1] < min) {
                    ans++;
                    min = arr[i][1];
                }
            }
            System.out.println(ans);



            n--;
        }
    }

}
