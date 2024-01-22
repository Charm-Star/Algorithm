import java.util.Scanner;

public class P1254 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int len = str.length();


        for (int i = len / 2; i < len; i++) {
            String front = str.substring(0 , i);
            String back = flip(str.substring(i , len));

            System.out.println(front);
            System.out.println(back);
            if(front.endsWith(back) || back.startsWith(front)){
                System.out.println(i * 2);
                return;
            }

        }


    }
    private static String flip(String word){
        String ret = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            ret += word.charAt(i);
        }
        return  ret;
    }

}
