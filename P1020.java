import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1020 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();
        int length = number.length();
        int a = Integer.parseInt(number);
        int target = 0;


        int[] map =  new int[10];

        map[0]=6;
        map[1]=2;
        map[2]=5;
        map[3]=5;
        map[4]=4;
        map[5]=5;
        map[6]=6;
        map[7]=3;
        map[8]=7;
        map[9]=5;
        for (int i = 0; i < length; i++) {

            target+=map[Integer.parseInt(String.valueOf(number.charAt(i)))];
        }


        for(int i = a;i < Math.pow(10,length);i++){


        }






    }


}
