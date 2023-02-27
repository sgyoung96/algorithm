import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mYear = 2531 - 1988;
		
		Scanner scanner = new Scanner(System.in);
		String year = scanner.next();
		scanner.close();
		
		if (Integer.parseInt(year)>= 1000 && Integer.parseInt(year) <= 3000) {
			System.out.println(Integer.parseInt(year) - mYear);
		}
	}
}
