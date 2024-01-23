import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P14940 {

    static int n,m;
    static int[] dx ={0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        Queue<int[]> q = new LinkedList<>();
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        boolean[][] v = new boolean[n][m];
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
                if(map[i][j] == 2){

                    q.add(new int[] {i ,j});
                    v[i][j] = true;
                    map[i][j] = 0;
                }
            }
        }

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y +dy[i];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m){
                    continue;
                }
                if(map[nx][ny] == 0){
                    continue;
                }
                if(v[nx][ny]){
                    continue;
                }
                map[nx][ny] = map[x][y] + 1;
                v[nx][ny] = true;
                q.add(new int[] { nx,ny});
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j] != 0 && v[i][j]==false){
                    map[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }





    }
}
