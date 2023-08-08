import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1024 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int l = Integer.parseInt(input[1]);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();


        int start = 0;
        while(start<(n/2)+1){
            int add = 0;
            ArrayList<Integer> answer = new ArrayList<>();
            for(int i = start; i < (n/2)+1 ; i++){
                add+=i;

                if(add==n&& i-start+1 >=l){
                    for (int j = start; j <= i; j++) {
                        answer.add(j);
                    }
                    list.add(answer);
                } else if (add>n) {
                    continue;
                }
            }
            start++;


        }

        ArrayList<Integer> k = null;
        int min = 101;
        for(ArrayList<Integer> asd : list){
            int len = asd.size();
            if(len < min){
                k = asd;
                min = k.size();
            }


        }

        if(min>=101){
            System.out.println(-1);
        }else {
            for (int m : k) {
                System.out.print(m + " ");
            }
        }
    }
}
