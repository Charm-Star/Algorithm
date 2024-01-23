import java.util.Arrays;
import java.util.Scanner;

public class P2304 {
    static int[] view ;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] col = new int[n][2];

        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            int h = sc.nextInt();
            col[i][0] = pos;
            col[i][1] = h;
        }

        Arrays.sort(col, (o1, o2) -> {
            return o1[0]-o2[0];
        });


        int area = 0;
        for(int i=0;i<n;){
            int j=i+1;
            int max = j;
            while(j<n && col[i][1]>col[j][1]){
                if(col[max][1]<col[j++][1]) max = j-1;
            }

            if(j>=n){
                area+=col[i][1];
                if(max<n) area+=col[max][1]*(col[max][0]-col[i][0]-1);
                i=max;
            }else{
                area+= col[i][1]*(col[j][0]-col[i][0]);
                i=j;
            }

        }
        System.out.println(area);


    }
}
