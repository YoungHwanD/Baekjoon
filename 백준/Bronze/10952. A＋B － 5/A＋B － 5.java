
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int sum = 0;
//		int[] arr = new int[2];
//		
//		
//		for(int i = 0; i < 100; i++) {
//			for(int j = 0; j < 2; j++) {
//				arr[j] = sc.nextInt();
//				if(arr[0] == 0 && arr[1] == 0) {
//					break;
//				}
//			}
//			
//			for(int j = 0; j < 2; j++) {
//				sum += arr[j];
//			}
//			System.out.println(sum);
//			sum = 0;
//			
//		}

		for (;;) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (A == 0 && B == 0) {
				sc.close();
				break;
			}
			System.out.println(A + B);
		}

	}
}
