package school;

public class Student {
	private String name;
	private int age;
	private boolean isvisible; // 집체 ture, 원격 false
	private double temperature;
	
	//생성자
	public Student(String name, int age) {
		isvisible = true;
		temperature = 36.5;
		this.name = name;
		this.age = age;
	}
	
	
	// 자동완성 기능으로getter setter 메소드 완성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVisible() {
		return isvisible;
	}
	public void setIsVisible(boolean isvisible) {
		this.isvisible = isvisible;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	//toString
	@Override
	public String toString() {
		return "학생 [이름=" + name + ", 나이=" + age + ", 집체=" + isvisible + ", 온도=" + temperature + "]";
	}
	
	
	
}
