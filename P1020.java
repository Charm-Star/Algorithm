import java.beans.Introspector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1020 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();
        long length = number.length();
        long a =Long.parseLong(number)+1;
        long target = 0;

        long b = (int) Math.pow(10,length);

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
        int count = 1;

        while (true){
            int digitnum=0;

            String snum = String.valueOf(a);
            if(a>=Math.pow(10,length)){

                long asd = a-(int)Math.pow(10,length);

                snum = String.valueOf(asd);
            }

            if(snum.length()!=length){
                String temp="";
                for (int i = 0; i < length-snum.length(); i++) {
                    temp+="0";
                }

                snum=temp+snum;
            }
//            System.out.println(snum+"snum 입니다");


            for (int i = 0; i < length; i++) {
                digitnum+=map[Integer.parseInt(String.valueOf(snum.charAt(i)))];
            }
//            System.out.println(digitnum);
//            System.out.println(count);



            if(digitnum==target){
                System.out.println(count);
                break;
            }
            a++;
            count++;



        }






    }


}
