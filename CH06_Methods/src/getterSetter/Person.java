package getterSetter;

public class Person {
	//private는 같은 클래스에서만 접근가능
	private String name;
	private int age;
	
	// public은 다른 클래스에서 쓸 수 있음
	// set은 값을 입력하는 메소드
	public void setName(String name) {
		this.name = name; // 이때 this는 인스턴스 의미
	}
	
	// get 메소드는 값을 리턴하는 메소드
	public String getName() {
		return name;
	}
	
	// set get age 만들기
	
	public void setAge(int age) {
		System.out.println(this);
		this.age = age;
	}
	
	public int getAge() {
		System.out.println(this);
		return age;
	}
}
