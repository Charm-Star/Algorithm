import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class P1141 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }
        Collections.sort(list);

        for (int i = 0; i < n; i++) {
            if(list.get(i) != null) {
                for (int j = i + 1; j < n ; j++) {
                    if(list.get(j).startsWith(list.get(i))){
                        list.set(i,"0");
                    }
                }
            }
        }

        for(int i = 0; i < n ; i++){
            if(list.get(i) != "0"){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
