import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb1 = new StringBuilder(st.nextToken()).reverse();
        StringBuilder sb2 = new StringBuilder(st.nextToken()).reverse();

        int A = Integer.parseInt(sb1.toString());
        int B = Integer.parseInt(sb2.toString());
        
        br.close();
        
        System.out.println(Math.max(A,B));
    }
}
