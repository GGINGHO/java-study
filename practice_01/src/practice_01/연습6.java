package practice_01;

import java.util.Scanner;

public class 연습6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int inch = scanner.nextInt();
		double inchToCm = 2.54;
		double cm = inch * inchToCm;
		System.out.println("허리 둘레의 길이는 : " + cm +"cm");
		scanner.close();

	}

}
