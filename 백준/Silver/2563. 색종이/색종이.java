
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] arr = new int[100][100];
		int z = 0;
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt()-1;
			int B = sc.nextInt()-1;
			z = B;
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k < 10; k++) {
					arr[A][B] = 1;					
					B++;
				}
				A++;
				B = z;
			}
		}
		
		for(int i = 0 ; i < 100; i++) {
			for(int j = 0 ; j < 100; j++) {
				if(arr[i][j] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
