package application;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("옵션을 선택 > ");
		int option = scanner.nextInt();
		
		// Switch 문으로 만들기
		switch(option) {
			case 1: {
				System.out.println("헬로우");
				break;
			}
			case 2: {
				System.out.println("안녕 ?");
				break;
			}
			case 3: {
				System.out.println("프로그램 종료");
				break;
			}
			case 10000: {
				System.out.println("이스터에그를 발견하셨습니다.");
				break;
			}
			default :
				System.out.println("잘못 입력하였습니다.");
				break;
		}
		
		// if else 문으로 만들기
//		if(option == 1) {
//			System.out.println("헬로우");
//		}
//		
//		else if (option == 2) {
//			System.out.println("안녕 ?");
//		}
//		else if (option == 3) {
//			System.out.println("프로그램 종료");
//		}
//		else if (option == 10000) {
//			System.out.println("이스터에그를 발견하셨습니다.");
//		}
//		else {
//			System.out.println("잘못 입력하였습니다.");
//		}
	}
}