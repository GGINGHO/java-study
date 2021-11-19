package application;

import java.util.Scanner;

public class Swich2 {
	

	public static void main(String[] args) {
		// Switch 문 문자 입력
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("계속 진행하겠습니까? (y/n): ");
		
		String input = scanner.nextLine();
		scanner.close();
		
		switch(input) {
			case "y": 
				System.out.println("계속 진행합니다.");
				break; 
			case "n": 
				System.out.println("종료합니다.");
				break;  			
			default: // else와 같음 위의 케이스에 맞는 것이 없을때 실행
				System.out.println("잘못된 입력입니다.");
				break;
		}
	}
}
