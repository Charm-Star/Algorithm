import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class P1946 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        while(n != 0){

            int length = Integer.parseInt(br.readLine());

            int [][] arr = new int[length][2];

            for (int i = 0; i < length; i++) {
                String[] temp  = br.readLine().split(" ");
                arr[i][0] = Integer.parseInt(temp[0]);
                arr[i][1] = Integer.parseInt(temp[1]);
            }

            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] arr1, int[] arr2) {
                    return Integer.compare(arr1[0], arr2[0]);
                }
            });


            int ans = 1; // 서류 1등은 무조건 통과
            int min =arr[0][1]; // 면접 점수 최소값
            for(int i = 1; i < length; i++) { // 서류 2등부터 시작
                if(arr[i][1] < min) { // 이전의 최소 면접 점수보다 낮으면 통과
                    ans++;
                    min = arr[i][1]; // 최소 점수 갱신
                }
            }
            System.out.println(ans);



            n--;
        }
    }

}
