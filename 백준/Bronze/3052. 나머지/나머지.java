import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();
        int N;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            N = Integer.parseInt(br.readLine());
            if (set.contains(N % 42)) {
                continue;
            } else {
                set.add(N % 42);
                result++;
            }
        }
        System.out.println(result);
    }
}
