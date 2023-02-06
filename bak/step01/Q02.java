package bak.step01;

import java.util.Scanner;

/*
문제 : A+B
설명 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	  첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
	  첫째 줄에 A+B를 출력한다.
작성 : 달별 선장
제출 : 패키지명을 제외하고, 클래스명은 Main 으로 바꾸어서 제출, import 문도 삽입해야 한다.
출처 : 백준 알고리즘
*/
public class Q02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = Integer.parseInt(scanner.next());
		int b = Integer.parseInt(scanner.next());
		if (a > 0 && b < 10) {
			System.out.println(a+b);
		}
	}
}

