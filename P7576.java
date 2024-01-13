import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P7576 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n;
    static int m;
    static int[][] map;
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        m = Integer.parseInt(input[0]);
        n = Integer.parseInt(input[1]);

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
                if(map[i][j] == 1){
                    q.offer(new int[]{i , j});
                }
            }
        }

        System.out.println(bfs() - 1);
    }
    public static int bfs(){

        while(!q.isEmpty()){
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m){
                    continue;
                }
                if(map[nx][ny] == 0){
                    map[nx][ny] = map[x][y] + 1;
                    q.add(new int[] {nx,ny});
                }
            }
        }

        int answer = 0;

        if(checkMap()){
            return answer;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer = Math.max(answer , map[i][j]);
            }
        }


        return answer;

    }
    private static boolean checkMap(){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j] == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
