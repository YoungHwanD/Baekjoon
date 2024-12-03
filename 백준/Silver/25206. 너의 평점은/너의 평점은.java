import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double total = 0;       // 0.0이랑 같나
        double totalCredit = 0;
        double score;


        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());

            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("A+")) {
                score = 4.5;
            } else if (grade.equals("A0")) {
                score = 4.0;
            } else if (grade.equals("B+")) {
                score = 3.5;
            } else if (grade.equals("B0")) {
                score = 3.0;
            } else if (grade.equals("C+")) {
                score = 2.5;
            } else if (grade.equals("C0")) {
                score = 2.0;
            } else if (grade.equals("D+")) {
                score = 1.5;
            } else if (grade.equals("D0")) {
                score = 1.0;
            } else if (grade.equals("F")) {
                score = 0;
            } else {
                continue;
            }

            total += credit * score;
            totalCredit += credit;
        }

        System.out.printf("%.6f", total / totalCredit);

    }
}
