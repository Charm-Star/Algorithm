import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class P12891 {
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 처리 최적화
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int s = input[0];
        int p = input[1];

        String dna = br.readLine();

        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int answer = 0;

        // HashMap을 사용하여 빈도수 관리
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < p; i++) {
            frequency.put(dna.charAt(i), frequency.getOrDefault(dna.charAt(i), 0) + 1);
        }

        // 초기 윈도우에서 check 수행
        if (check(frequency)) answer++;

        for (int i = 1; i <= s - p; i++) {
            // 이전 문자 제거
            char removedChar = dna.charAt(i - 1);
            frequency.put(removedChar, frequency.get(removedChar) - 1);

            // 새로운 문자 추가
            char newChar = dna.charAt(i + p - 1);
            frequency.put(newChar, frequency.getOrDefault(newChar, 0) + 1);

            // check 수행
            if (check(frequency)) answer++;
        }

        System.out.println(answer);
    }

    private static boolean check(HashMap<Character, Integer> frequency) {
        return frequency.getOrDefault('A', 0) >= arr[0] &&
                frequency.getOrDefault('C', 0) >= arr[1] &&
                frequency.getOrDefault('G', 0) >= arr[2] &&
                frequency.getOrDefault('T', 0) >= arr[3];
    }
}
