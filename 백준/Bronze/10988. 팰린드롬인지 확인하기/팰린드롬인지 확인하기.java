import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = s.length() - 1;
        int pal = 1;

        for (int i = 0; i < s.length() / 2; i++) {
            char c = s.charAt(i);
            char c2 = s.charAt(n - i);

            if (c != c2) {
                pal = 0;
                break;
            }
        }
        
        System.out.println(pal);
    }
}
