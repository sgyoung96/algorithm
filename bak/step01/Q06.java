package bak.step01;

import java.util.Scanner;

/*
문제 : 사칙연산
설명 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
	  두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
	  첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
작성 : 달별 선장
제출 : 패키지명을 제외하고, 클래스명은 Main 으로 바꾸어서 제출, import 문도 삽입해야 한다.
출처 : 백준 알고리즘
*/
public class Q06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tempA = scanner.next();
		String tempB = scanner.next();
		scanner.close();
		
		int a = 0;
		int b = 0;

		if (Integer.parseInt(tempA) >= 1) {
			a = Integer.parseInt(tempA);
		}
		
		if (Integer.parseInt(tempB) <= 10000) {
			b = Integer.parseInt(tempB);
		}
		
		if (a >= 1 && b <= 10000) {
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
			System.out.println(a % b);
		}
	}
}

