package bak.step01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String calA = scanner.nextLine();
		String calB = scanner.nextLine();
		
		String calB3 = calB.substring(2);
		String calB2 = calB.substring(1, 2);
		String calB1 = calB.substring(0, 1);
		
		int a = Integer.parseInt(calA);
		int b = Integer.parseInt(calB);
		int b3 = Integer.parseInt(calB3);
		int b2 = Integer.parseInt(calB2);
		int b1 = Integer.parseInt(calB1);
		
		System.out.println(a * b3);
		System.out.println(a * b2);
		System.out.println(a * b1);
		System.out.println(a * b);
	}
}

