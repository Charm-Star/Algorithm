import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1052 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int tempN = n;
        int k = Integer.parseInt(input[1]);
        if(k == 0){
            System.out.println(-1);
            return;
        }

        while(true){
            int oneCount = convert(n);

            if(oneCount <= k){
                System.out.println(n - tempN);
                return;
            }
            n++;

        }

        }

        private static int convert(int n){

            int count = 0;

            while(n != 0){
                if(n % 2 == 1){
                    count++;
                    n -= 1;
                }
                n /= 2;
            }


            return count;
        }

    }
