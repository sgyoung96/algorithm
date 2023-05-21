package bak.step01;

import java.util.Scanner;

/*
문제 : A/B
설명 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
	  첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
	  첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
	  10-9 이하의 오차를 허용한다는 말은 꼭 소수 9번째 자리까지만 출력하라는 뜻이 아니다.
작성 : 달별 선장
제출 : 패키지명을 제외하고, 클래스명은 Main 으로 바꾸어서 제출, import 문도 삽입해야 한다.
출처 : 백준 알고리즘
*/
public class Q05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		scanner.close();
		if (Double.parseDouble(a) > 0 && Double.parseDouble(b) < 10) {
			System.out.print(Double.parseDouble(a) / Double.parseDouble(b));
		}
	}

}

