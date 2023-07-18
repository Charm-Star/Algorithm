import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P16508 {
    static List<Book> books = new ArrayList<>();
    static String T;
    static int[] count = new int[26];
    static int[] select_cnt = new int[26];
    static int n, min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = br.readLine();
        int len = T.length();
        for (int i = 0; i < len; i++) {
            count[T.charAt(i) - 'A']++;
        }

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            books.add(new Book(Integer.parseInt(st.nextToken()), st.nextToken()));
        }

        dfs(0, 0);
        System.out.println(min == Integer.MAX_VALUE ? - 1 : min);
    }

    static void dfs(int index, int total) {
        if (index == n) {

            if (check()) {
                min = Math.min(min, total);
            }
            return;
        }

        for (int i = 0; i < books.get(index).getTitle().length(); i++) {
            select_cnt[books.get(index).getTitle().charAt(i) - 'A']++;
        }
        dfs(index + 1, total + books.get(index).getPrice());
        for (int i = 0; i < books.get(index).getTitle().length(); i++) {
            select_cnt[books.get(index).getTitle().charAt(i) - 'A']--;
        }
        dfs(index + 1, total);
    }

    static boolean check() {
        for (int i = 0; i < 26; i++) {
            if (count[i] > select_cnt[i]) {
                return false;
            }
        }
        return true;
    }
}

class Book {
    int price;
    String title;

    public Book (int price, String title) {
        this.price = price;
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}