import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int m = 0;

        if (A == B && B == C) {
            m = 10000 + (A * 1000);
        } else if (A != B && A != C && B != C) {
            m = Math.max(A, Math.max(B, C)) * 100;
        } else if (A == B || B == C) {
            m = 1000 + (B * 100);
        } else {
            m = 1000 + (A * 100);
        }
        System.out.println(m);
    }
}
