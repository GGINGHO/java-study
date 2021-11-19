package practice_01;

import java.util.Scanner;

public class 연습7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextInt();
		double b = scanner.nextInt();
		double c = a * b ;
		double d = a / b ;
		double e = a % b ;
		
		System.out.println("곱하기 : " + c);
		System.out.printf("나누기 몫: %.3f \n",d);
		System.out.println("나누기 나머지: " + e);
		scanner.close();

	}

}
