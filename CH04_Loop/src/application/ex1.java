package application;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("옵션을 선택 > ");
		int option = scanner.nextInt();
		
		if(option == 1) {
			System.out.println("헬로우");
		}
		
		else if (option == 2) {
			System.out.println("안녕 ?");
		}
		else if (option == 3) {
			System.out.println("프로그램 종료");
		}
		else if (option == 10000) {
			System.out.println("이스터에그를 발견하셨습니다.");
		}
		else {
			System.out.println("잘못 입력하였습니다.");
		}
	}
}