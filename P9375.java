import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class P9375 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {

            HashMap<String,Integer> map = new HashMap<>();

            int m = Integer.parseInt(br.readLine());

            for (int j = 0; j < m; j++) {
                String[] input = br.readLine().split(" ");

                map.put(input[1],map.getOrDefault(input[1],0)+1);


            }
            int answer = 1;
            for(String key : map.keySet()){
                answer*= map.get(key)+1;
            }
            System.out.println(answer-1);


        }



    }
}
