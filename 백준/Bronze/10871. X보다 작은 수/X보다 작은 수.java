import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int res;

        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            res = Integer.parseInt(st.nextToken());
            if (res < X) {
                sb.append(res).append(" ");
            }
        }
        br.close();
        
        System.out.println(sb.toString());

    }
}
