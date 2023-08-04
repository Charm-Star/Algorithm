import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P1927 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Long> q = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {

            long a = Long.parseLong(br.readLine());

            if(a!=0){
                q.add(a);
            }else{
                if(q.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(q.poll());
                }

            }


            
        }

    }
}
