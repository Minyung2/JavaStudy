package jun.animal;

public class AnimalRun {

	public static void main(String[] args) {
		Dog dog = new Dog("개새끼", 5);
		System.out.println(dog.name);
		System.out.println(dog.age);
		dog.sound();
		
	}

}
