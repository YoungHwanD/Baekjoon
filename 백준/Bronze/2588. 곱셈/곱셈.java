import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        System.out.println((B % 10) * A);
        System.out.println(((B % 100) / 10) * A);
        System.out.println((B / 100) * A);
        System.out.println(B * A);
        
    }
}
