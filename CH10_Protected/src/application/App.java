package application;

import entities.*; // 패키지 entities에 있는 모든 클래스를 불러옴 (*)

public class App {

	public static void main(String[] args) {
		//프로텍트 protect
		Fruit f1 = new Apple();
		//f1.id=7;
		System.out.println(f1.toString());
		
		Fruit f2 = new Banana();
		System.out.println(f2.toString());
	}

}
