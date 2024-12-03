import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int cnt = 0;
        int pre_str = ' ';

        while (true) {
            int ch = System.in.read();
            if (ch == '\n') {
                if (pre_str != ' ') cnt++;
                break;
            }
            if (ch == ' ') {
                if (pre_str != ' ') cnt++;
            }
                pre_str = ch;
        }

            System.out.println(cnt);
    }
}
