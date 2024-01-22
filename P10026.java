import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P10026 {
    static char[][] map;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};
    static boolean[][] v;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        
        map = new char[n][n];
        v = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j);
            }
        }

        int nomalCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!v[i][j]){
                    bfs(i,j);
                    nomalCount++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] == 'R'){
                    map[i][j] = 'G';
                }
            }
        }
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                v[i][j] = false;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!v[i][j]){
                    bfs(i,j);
                    count++;
                }
            }
        }

        System.out.println(nomalCount +" "+ count);
    }


    private static void bfs(int x, int y) {
        v[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x,y});

        while (!q.isEmpty()){
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx < 0 || nx >= n || ny < 0 || ny >= n){
                    continue;
                }

                if(map[cx][cy] == map[nx][ny] && !v[nx][ny]){
                    v[nx][ny] = true;
                    q.add(new int[] {nx,ny});
                }
            }

        }



    }

}
