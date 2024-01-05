import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P9461 {

    static long[] seq = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        padovan();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            System.out.println((seq[Integer.parseInt(br.readLine())]));
        }

    }

    public static void padovan() {

        seq[1] = 1;
        seq[2] = 1;
        seq[3] = 1;
        seq[4] = 2;
        seq[5] = 2;

        for (int i = 6; i < 101; i++) {
            seq[i] = seq[i - 1] + seq[i - 5];
        }
    }

}