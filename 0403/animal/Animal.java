package jun.animal;

public class Animal {
	protected String name;
	protected int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void sound() {
		System.out.println("동물 소리를 내고 있습니다.");
	}
	public static void main(String[] args) {
		
	}
}
