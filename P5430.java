import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String commend = br.readLine();
            int n = Integer.parseInt(br.readLine());
            int[] arr = makeArr(n,br.readLine());

            for (int j = 0; j < commend.length(); j++) {
                if(commend.charAt(j) == 'R'){
                    arr = fR(arr);
                }else{
                    if(arr.length == 0){
                        System.out.println("error");
                        break;
                    }
                    arr = fD(arr);
                }
            }

            if(arr.length != 0){
                System.out.println(Arrays.toString(arr));
            }
        }

    }

    private static int[] fD(int[] arr) {
        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        return newArr;
    }

    private static int[] fR(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    private static int[] makeArr(int n,String s) {
        int[] arr = new int[n];
        String[] temp = s.substring(1,s.length() - 1).split(",");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        return arr;
    }

}
