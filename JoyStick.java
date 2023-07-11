import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JoyStick {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int answer = 0;
        int len = name.length();
        int index;


        for (int i = 0; i < len; i++) {
            answer +=Math.min(name.charAt(i)-65,90-(int)name.charAt(i)+1);
            index = i + 1;
            while(index < len && name.charAt(index) == 'A'){
                index++;
            }




        }



        System.out.println(answer);





    }
}
