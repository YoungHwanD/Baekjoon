import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = 0;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > M) {
                M = arr[i];
            }
        }
        
        br.close();

//        int Max = Arrays.stream(arr).max().getAsInt();        // Stream API로 최대값 구하기

        double score = 0;

        for (int i = 0; i < N; i++) {
            score += (double) arr[i] / M * 100;
        }

        System.out.print(score / N);
    }
}
