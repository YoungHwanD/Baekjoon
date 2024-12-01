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
        int i, j, tmp;
        int[] arr = new int[N];

        for (int a = 1; a <= N; a++) {
            arr[a - 1] = a;
        }

        for (int b = 1; b <= M; b++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            tmp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = tmp;
        }

        for (int a = 0; a < N; a++) {
            System.out.print(arr[a] + " ");
        }

    }
}
