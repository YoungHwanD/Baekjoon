
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = N;
		int cnt = 0;
		
		do {
			N = (((N%10)*10) + ((N/10) + (N%10))%10);
			cnt++;
		} while (N != M);
		System.out.println(cnt);
	}
}
