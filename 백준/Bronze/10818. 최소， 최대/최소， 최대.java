import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int res;
        int max = -1000000;
        int min = 1000000;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            res = Integer.parseInt(st.nextToken());

            max = Math.max(max, res);
            min = Math.min(min, res);
        }
        System.out.printf("%d %d", min, max);
    }
}
