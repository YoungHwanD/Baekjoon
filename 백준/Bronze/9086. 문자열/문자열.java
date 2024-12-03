import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s1 = br.readLine();
            System.out.print(s1.charAt(0));
            System.out.print(s1.charAt(s1.length() - 1));
            System.out.println();
        }

    }
}
