import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strA = scanner.next();
		String strB = scanner.next();
		String strC = scanner.next();
		
		int a = Integer.parseInt(strA);
		int b = Integer.parseInt(strB);
		int c = Integer.parseInt(strC);
		
		if (a >= 2 && b <= 10000 && c <= 10000) {
			System.out.println((a+b)%c);
			System.out.println(((a%c) + (b%c)) % c);
			System.out.println((a*b)%c);
			System.out.println((a%c) * (b%c) % c);
		}
	}
}