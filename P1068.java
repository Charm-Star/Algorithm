import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1068 {
    static int[] arr;
    static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int deleteNode = Integer.parseInt(br.readLine());
        int answer = 0;
        arr[deleteNode] = deleteNode;



        for (int i = 0; i < n; i++) {

            if(findParent(i) == -1 && !contains(i)){
                answer++;
            }

        }
        System.out.println(answer);
    }

    private static boolean contains(int i) {
        for (int j = 0; j < n; j++) {
            if(arr[j] == i){
                return true;
            }
        }
        return false;
    }

    private static int findParent(int i) {

        if(arr[i] == -1){
            return -1;
        } else if (arr[i] == i) {
            return i;
        } else{
            return findParent(arr[i]);
        }
    }
}
