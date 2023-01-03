
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < T; i++) {
			for(int j = 0; j < 2; j++) {
				int A = sc.nextInt();
				sum += A;
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}
