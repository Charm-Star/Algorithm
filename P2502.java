import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2502 {

    private static int day;
    private static int count;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        day = Integer.parseInt(input[0]);

        count = Integer.parseInt(input[1]);

        int firstDay = 1;

        int secondDay ;

        while(true){
            secondDay  = firstDay + 1;
            while(secondDay != count - 1){
                if(solve(firstDay,secondDay))
                    return;
                secondDay++;
            }
            firstDay++;
        }



    }
    private static boolean solve(int firstDay,int secondDay){

        int[] arr = new int[day];
        arr[0] = firstDay;
        arr[1] = secondDay;

        for (int i = 2; i < day; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        if(arr[day - 1] != count)
            return false;

        System.out.println(firstDay);
        System.out.println(secondDay);
        return true;
    }

}


