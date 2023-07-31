import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            gold(Integer.parseInt(br.readLine()));
        }

    }

    static void gold(int a) {
        int b = a/2;

        for(int i = b ;i >1;i--){
            int c = a-i;

            if(isSosu(c)&&isSosu(i)){
                System.out.println(i+" "+c);
                return;
            }

        }

    }

    static boolean isSosu(int a) {
        int num = 2;
        if (a == 1) {
            return false;
        }
        while (num < a) {
            if (a % num == 0) {
                return false;
            }
            num++;

        }
        return true;
    }
}
