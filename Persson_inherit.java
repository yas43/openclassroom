package yash_yaser;

interface Father {
	int inherit = 100;
}

interface Uncle {
	int inherit = 50;

}

interface Grand_mother {
	int inherit = 150;

}

class Perssonn implements Father, Grand_mother, Uncle {
	void inherit_calcul() {
		int total = Father.inherit + Uncle.inherit + Grand_mother.inherit;
		System.out.println("total inheritance is " + total);
	}

}

public class Persson_inherit {

	public static void main(String[] args) {

		Perssonn me = new Perssonn();

		me.inherit_calcul();

	}

}
