import java.io.IOException;
import java.util.Arrays;

public class MinRectangle {

    class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int n = sizes.length;
            int w = 0;
            int h = 0;

            for (int i = 0; i < n; i++) {

                Arrays.sort(sizes[i]);

                w = Math.max(sizes[i][0], w);

                h = Math.max(sizes[i][1], h);
            }

            return w * h;
        }
    }

}
