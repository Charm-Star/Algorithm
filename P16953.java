import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class P16953 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Queue<long[]> queue = new LinkedList<>();
        queue.offer(new long[]{A, 1});

        int minOperations = -1;

        while (!queue.isEmpty()) {
            long[] current = queue.poll();
            long currentValue = current[0];
            long count = current[1];

            if (currentValue == B) {
                minOperations = (int) count;
                break;
            }

            long nextValue1 = currentValue * 2;
            if (nextValue1 <= B) {
                queue.offer(new long[]{nextValue1, count + 1});
            }

            long nextValue2 = currentValue * 10 + 1;
            if (nextValue2 <= B) {
                queue.offer(new long[]{nextValue2, count + 1});
            }
        }

        System.out.println(minOperations);
    }
}
