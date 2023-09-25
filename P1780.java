
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1780 {

    public static int[][] board;
    public static int MINUSONE = 0;
    public static int ZERO = 0;
    public static int ONE = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, N);

        System.out.println(MINUSONE);
        System.out.println(ZERO);
        System.out.println(ONE);

    }


    public static void divide(int row, int col, int size) {


        if (colorCheck(row, col, size)) {
            if(board[row][col] == -1) {
                MINUSONE++;
            }
            else if(board[row][col] == 0) {
                ZERO++;
            }
            else {
                ONE++;
            }

            return;
        }

        int newSize = size / 3;

        divide(row, col, newSize);
        divide(row, col + newSize, newSize);
        divide(row, col + 2 * newSize, newSize);

        divide(row + newSize, col, newSize);
        divide(row + newSize, col + newSize, newSize);
        divide(row + newSize, col + 2 * newSize, newSize);

        divide(row + 2 * newSize, col, newSize);
        divide(row + 2 * newSize, col + newSize, newSize);
        divide(row + 2 * newSize, col + 2 * newSize, newSize);

    }


    public static boolean colorCheck(int row, int col, int size) {
        int color = board[row][col];


        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (color != board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}