import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2018 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 1; i <= N ; i++){

            int start = i ;
            int sum = 0;
            while(sum <= N){
                sum += start;
                start++;
                if(sum == N){
                    answer++;
                }
            }
        }

        System.out.println(answer);



    }
}
