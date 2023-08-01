import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1016 {
    static int answer = 0;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a , b;

        String[] input = br.readLine().split(" ");

        a = Long.parseLong(input[0]);

        b = Long.parseLong(input[1]);

        for(long i = a; i <= b ; i++){


            isPowNN(i);


        }
        System.out.println(answer);

    }
    public static void isPowNN(long number){
        if (number== 1){
            answer++;
            return;
        }


        for (long i = 2; i <= Math.sqrt(number); i++) {
            if(number%(i*i)==0){
                return;
            }
        }
        answer++;


    }
}
