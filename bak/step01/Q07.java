package bak.step01;

import java.util.Scanner;

/*
문제 : ??!
설명 : 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 
	준하는 놀람을 ??!로 표현한다. 
	준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 
	놀람을 표현하는 프로그램을 작성하시오.
	
	첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어진다.
	아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘지 않는다.
	
	첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.
작성 : 달별 선장
제출 : 패키지명을 제외하고, 클래스명은 Main 으로 바꾸어서 제출, import 문도 삽입해야 한다.
출처 : 백준 알고리즘
*/
public class Q07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		scanner.close();
		System.out.println(id + "??!");
	}
}

