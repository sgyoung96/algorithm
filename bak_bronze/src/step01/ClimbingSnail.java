package step01;

import java.util.Scanner;

/**
 * 달팽이는 올라가고 싶다.
 * 
 * @author gayeong
 *
 */
public class ClimbingSnail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int V = scanner.nextInt();
		int day = 0;
		
		if (A >= V) {
			day = 1;
			System.out.println(day);
		} else if (A < V) {
			day = 2;
			
		} 
	}

}
