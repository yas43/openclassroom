package yash_yaser;

class Animalgroup {
	boolean is_Pederator;
	boolean is_Mamel;
	boolean is_Danger;

	void make_sound() {
		System.out.println("all the animal have their own sound");
	}
}

class Catsgroup extends Animal {
	int age;
	String name;

	void make_sound() {
		System.out.println("cats sound is like mieu mieu !!");
	}
}

class Lion extends Animalgroup {
	int weigth;

}

public class Catsfamily {

	public static void main(String[] args) {

		Lion lion = new Lion();
		Catsgroup cat = new Catsgroup();

	}

}
