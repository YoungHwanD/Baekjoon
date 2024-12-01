import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int i, j, k;
        int[] arr = new int[N];

        for (int a = 1; a <= M; a++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            for (int b = i; b <= j; b++) {
                arr[b - 1] = k;
            }
        }

        for (int a = 0; a < N; a++) {
            System.out.printf("%d ", arr[a]);
        }

    }
}
