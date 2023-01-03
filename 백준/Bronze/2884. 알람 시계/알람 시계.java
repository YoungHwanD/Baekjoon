
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt()-45;
		
		if(minute < 0) {
			if(hour - 1 < 0) {
				hour = 23;
				System.out.printf("%d %d", hour, minute+60);
			}else {
				System.out.printf("%d %d", hour-1, minute+60);
			}
		}else {
			System.out.printf("%d %d", hour, minute);
		}
	}
}
