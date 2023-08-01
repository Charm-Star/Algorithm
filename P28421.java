import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class P28421 {
    static int n, q;
    static int[] arr;
    static ArrayList<Integer> answer = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        n = Integer.parseInt(input[0]);
        q = Integer.parseInt(input[1]);

        arr = new int[n];
        String[] inputArr = br.readLine().split(" ");
        for(int i = 0; i < n ; i++){
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        for (int i = 0; i < q; i++) {
            String[] task = br.readLine().split(" ");
            solve(Integer.parseInt(task[0]),Integer.parseInt(task[1]));
        }
//        for (int i = 0; i < answer.size(); i++) {
//            System.out.println(answer.get(i));
//        }

    }

    public static void solve(int code,int number){
        if(code==1){
            find(number);
        }else{
            arr[number-1] = 0;
        }

    }
    public static void find(int number){
        Set<Integer> set = new HashSet<>();


        for (int i = 0 ; i < n ; i++){
            if(number==0&&arr[i]==0){
                System.out.println(1);
                return;
            }
            if(arr[i]==0){
                continue;
            }



            if(number%arr[i]==0){

                if(set.contains(number/arr[i])){
                    System.out.println(1);
                    return;
                }

                set.add(arr[i]);

            }


        }
//        answer.add(0);
        System.out.println(0);

    }
}
