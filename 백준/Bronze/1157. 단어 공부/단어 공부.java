import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();
        int[] cnt = new int[26];


        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            cnt[c - 'A']++;
        }

        int max = 0;
        char result = '?';

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                result = (char) (i + 'A');
            } else if (cnt[i] == max) {
                result = '?';
            }
        }
        
        System.out.println(result);
    }
}
