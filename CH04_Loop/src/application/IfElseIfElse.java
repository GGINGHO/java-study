package application;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) { 
		//스캐너
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("사과의 갯수는?");
			int apple = scanner.nextInt();
			System.out.println("바나나의 갯수는?");
			int banana = scanner.nextInt();
			
			scanner.close(); // 스캐너 종료(더 이상 안쓸때)
			
			// if의 조건이 참일 경우 {}안의 명령문을 실행한다.
			if(apple > banana) {
				System.out.println("사과가 바나나 보다 많음");
			}
			else if (banana > apple) { // 또 다른 조건은 else if(조건)을 사용한다. (여러개 사용가능)
				System.out.println("바나나가 사과 보다 많음");
			}
			else { // 위의 if문의 조건이 거짓일 경우 실행
				System.out.println("사과와 바나나가 같음");
			}
			
			System.out.println("프로그램 종료.");
	}

}
