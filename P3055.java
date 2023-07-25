import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P3055 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n;
    static int m;
    static Queue<int[]> q = new LinkedList<>();
    static Queue<int[]>wq = new LinkedList<>();
    static int answer = Integer.MAX_VALUE;
    static String[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        n = Integer.parseInt(inputs[0]);
        m = Integer.parseInt(inputs[1]);
        map = new String[n][m];

        for (int i = 0; i < n; i++) {
            String[] temp  = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                map[i][j] = temp[j];
                if(temp[j].equals("S")){
                    q.add(new int[] {i,j,0});
                } else if (temp[j].equals("*")) {
                    wq.add(new int[] {i,j});
                }
            }
        }

        while(!q.isEmpty()){
            int waterCount = wq.size();

            for (int i = 0; i < waterCount; i++) {

                int[] currentWater = wq.poll();
                int x = currentWater[0];
                int y = currentWater[1];



                for(int j = 0 ; j < 4; j++){
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny].equals(".")){
                        map[nx][ny] = "*";

                        wq.add(new int[]{nx,ny});
                    }
                }
            }



            int l = q.size();
            for (int i = 0; i < l; i++) {
                int[] t = q.poll();
                int x = t[0];
                int y = t[1];
                int time = t[2];
                for (int k = 0; k < 4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                        if (map[nx][ny].equals("D")) {
                            answer = Math.min(answer, time + 1);

                        } else if (map[nx][ny].equals(".")) {
                            map[nx][ny] = "S";
                            q.add(new int[]{nx, ny, time + 1});
                        }
                    }
                }
            }
        }

        if (answer == Integer.MAX_VALUE){
            System.out.println("KAKTUS");
        }else{
            System.out.println(answer);
        }




        }
    }
