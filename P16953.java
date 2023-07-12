
import java.util.*;


public class P16953{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[] {n,1});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int currNum = curr[0];
            int count = curr[1];
            if (m == currNum){
                System.out.println(count);
                break;
            }
            int dNum =  currNum*2;
            String numToString = String.valueOf(currNum)+"1";
            int StringToNum  = Integer.parseInt(numToString);

            if(dNum <= m) {

                q.offer(new int[]{dNum, count + 1});
            }


            if(StringToNum <= m){

                q.offer(new int[] {StringToNum,count+1});
            }




        }
        System.out.println(-1);
        






    }

}