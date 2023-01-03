
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int n = sc.nextInt();
		int h1 = 0;

		if (minute + n >= 60) {
			h1 = hour + ((minute + n) / 60);
			if(h1 >= 24) {
				
				System.out.printf("%d %d", h1-24, (minute + n) % 60);
			}else {
				System.out.printf("%d %d", h1, (minute + n) % 60);
			}
		}else {
			System.out.printf("%d %d", hour, (minute + n) % 60);
		}
	}
}
