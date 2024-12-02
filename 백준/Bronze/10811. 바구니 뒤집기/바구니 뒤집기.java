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

        int[] arr = new int[N];
        int i, j;

        for (int a = 0; a < N; a++) {
            arr[a] = a + 1;         // 바구니 배열에 숫자 대입(인덱스 + 1)
        }

        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken()) - 1;
            j = Integer.parseInt(st.nextToken()) - 1;

            while (j > i) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                i++;
            }
        }

        for (int a : arr) {
            System.out.printf("%d ", a);
        }

    }
}
