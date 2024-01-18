import java.util.Scanner;

public class P1911 {

    static int L;
    static boolean[] arr ;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[][] temp = new int[N][2];
        L = scan.nextInt();

        int answer = 0;

        for(int i = 0; i < N ; i++){
            int s = scan.nextInt();
            int e = scan.nextInt();
            max = Math.max(max , e);
            temp[i][0] = s;
            temp[i][1] = e;
        }
        arr = new boolean[max];

        for(int[] index : temp){
            for (int i = index[0]; i < index[1]; i++) {
                arr[i] = true;
            }
        }

        for (int i = 0; i < max; i++) {
            if(arr[i]){
                putBoard(i);
                answer++;
            }
        }
        System.out.println(answer);


    }

    private static void putBoard(int i) {
        for (int j = i; j < i + L; j++) {
            arr[j] = false;
        }
    }
}
