import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P12931 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        String[] temp  = br.readLine().split(" ");

        for(String number : temp)
            arr.add(Integer.parseInt(number));

        while(true){
            for(int i = 0; i < arr.size();i++){
                if(arr.get(i) % 2 == 1){
                    arr.set(i, arr.get(i) - 1);
                    count++;
                }
            }
            if(!isOnlyZero(arr)){
                for(int i = 0; i < arr.size() ; i++){
                    arr.set(i,arr.get(i) / 2);
                }
                count++;
            }else{
                break;
            }

        }
        System.out.println(count);

    }
    private static boolean isOnlyZero(ArrayList<Integer> arr){
        for(int i = 0 ; i < arr.size(); i++)
            if(arr.get(i) != 0)
                return false;
        return true;
    }

}
