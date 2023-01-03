
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int sum = 0;

		int[][] arr = new int[T][2];

		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 2; j++) {
				sum += arr[i][j];
			}
			System.out.printf("Case #%d: %d\n", i + 1, sum);
			sum = 0;
		}
	}

}
