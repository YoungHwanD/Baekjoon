import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());

            int Q = C / 25;
            C %= 25;

            int D = C / 10;
            C %= 10;

            int N = C / 5;
            C %= 5;

            int P = C;

            System.out.printf("%d %d %d %d\n", Q, D, N, P);
        }

    }
}
