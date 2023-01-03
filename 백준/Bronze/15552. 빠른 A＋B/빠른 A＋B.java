
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int[][] arr = new int [n][2];
//		int sum = 0;
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < 2; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < 2; j++) {
//				sum += arr[i][j];
//			}
//			System.out.println(sum);
//			sum = 0;	
//		}
		
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
			
			StringTokenizer st;
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
			
			}
			br.close();
			
			bw.flush();
			bw.close();
			
		
		
		
		
	}
}
