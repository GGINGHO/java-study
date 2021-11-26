package application;

import java.util.Random;

public class Hangman {
	private boolean running = false; // 게임을 계속 진행?
	private RandomWord word = new RandomWord();
	// 프로그램을 실행하는 런 메소드
	public void run() {
		do {
			displayWord();    // 화면에 단어표시
			getUserInput();   //입력받음
			checkUserInput(); // 맞는지 체크 (전부 맞으면 running = false)
		} while(running);
	}
	
	private void displayWord() {
		//System.out.println("화면에 단어 표시");
		//랜덤 워드 객체를 가져와서 수정		
		System.out.println(word.toString());
				
	}	

	private void getUserInput() {
		System.out.println("철자 하나 입력");		
	}

	private void checkUserInput() {
		System.out.println("맞는지 체크");		
	}
}
