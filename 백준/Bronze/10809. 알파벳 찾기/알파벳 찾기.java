import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        int[] word = new int[26];
        Arrays.fill(word, -1);      // word 배열을 -1로 채움

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            word[c - 'a'] = S.indexOf(c);       // 처음 등장한 인덱스 기록
        }

        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i] + " ");
        }
    }
}
