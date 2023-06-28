package yash_yaser;
interface Person {

	void person_method();
}

class Employee implements Person {

	@Override
	public void person_method() {
		System.out.println("implementation of person_method by employee class");
	}

}

class Stuff implements Person {
	@Override
	public void person_method() {
		System.out.println("implemention of person_method by steuff class");
	}
}

public class Highscools {

	static Person get_member() {
		return new Employee();
	}

	public static void main(String[] args) {
		get_member().person_method();

	}

}
