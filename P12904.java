import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class P12904 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] inputTarget = br.readLine().toCharArray();

        char[] inputResource = br.readLine().toCharArray();

        ArrayList<Character> target = new ArrayList<>();
        ArrayList<Character> resource = new ArrayList<>();

        for(char c : inputTarget)
            target.add(c);

        for(char c : inputResource)
            resource.add(c);

        while(!resource.isEmpty()){
            if(resource.get(resource.size() - 1) == 'B'){
                resource.remove(resource.size() - 1);
                swap(resource);
            }else{
                resource.remove(resource.size() - 1);
            }

            if(isEqual(target,resource)){
                System.out.println(1);
                return;
            }

        }
        System.out.println(0);
    }

    private static boolean isEqual(ArrayList<Character> target , ArrayList<Character> resource){
        String answer = target.stream()
                .map(Object::toString)
                .collect(Collectors.joining());

        String result = resource.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
        return answer.equals(result);
    }
    private static void swap( ArrayList<Character> resource){

        for(int i = 0 ; i < resource.size()/2 ; i++){
            Character temp;
            temp = resource.get(i);
            resource.set(i,resource.get(resource.size()- 1 -i));
            resource.set(resource.size() - 1 - i , temp);
        }

    }

}
