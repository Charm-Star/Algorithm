import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class P2824 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] tempListA = br.readLine().split(" ");

        BigInteger a =  BigInteger.ONE;

        for (int i = 0; i < n; i++) {
           a = a.multiply(BigInteger.valueOf(Long.parseLong(tempListA[i])));
        }

        int m = Integer.parseInt(br.readLine());

        String[] tempListB = br.readLine().split(" ");

        BigInteger b =  BigInteger.ONE;

        for (int i = 0; i < m; i++) {
            b = b.multiply(BigInteger.valueOf(Long.parseLong(tempListB[i])));

        }


        String gcd = a.gcd(b).toString();
        if(gcd.length()>9){
            gcd =gcd.substring(gcd.length()-9,gcd.length());
        }



        System.out.println(gcd);






    }

}
