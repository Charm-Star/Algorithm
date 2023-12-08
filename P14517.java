import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P14517 {

    private static int count = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String input = br.readLine();

        List<Character> arr = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            arr.add(input.charAt(i));
        }

        boolean[] v = new boolean[input.length()];

        for (int i = 1; i <= input.length(); i++) {
            combination(arr,v,0,input.length(),i);
        }

        System.out.println(count);

    }
    static void combination(List<Character> arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            solve(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
    static void solve(List<Character> arr, boolean[] visited, int n){
        String str = "";


        for (int i = 0; i < n; i++) {
            if(visited[i])
                str += arr.get(i);

        }

        if(check(str))
            count++;
    }
    static boolean check(String str) {
        int l = str.length();
        for (int i = 0; i < l / 2; i++) {
            if (str.charAt(i) != str.charAt(l - i - 1))
                return false;
        }
        return true;
    }

}
