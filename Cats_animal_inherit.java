package yash_yaser;

class Animal {
	int weight;
	String name;

	void present() {
		// this.weigth = weight;
		// this.name = name;
		System.out.println("this animal have " + weight + " weigth and its name is " + name);
	}
}

class Cats {
	int cod;
	String owner;

	void pet_info(int code, String owner) {
		System.out.println("this cat's owner is " + this.owner + " and it's code is " + this.cod);
	}
}

public class Cats_animal_inherit {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.weight = 1010;
		animal.name = "mishka";
		animal.present();

	}

}
