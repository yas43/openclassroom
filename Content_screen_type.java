package yash_yaser;

class Content {
	void content() {
		System.out.println("common content for all brand and screen_size and brand_type");
	}
}

class Screen_A extends Content {
	@Override
	void content() {
		System.out.println("content for screen_A ");
		super.content();
	}
}

class Screen_B extends Content {
	@Override
	void content() {
		System.out.println("content for screen_B ");
		super.content();
	}

}

class Screen_C extends Content {
	@Override
	void content() {
		System.out.println("content for screen_C ");
		super.content();
	}

}

class Brand_A extends Content {
	@Override
	void content() {
		System.out.println("content for brand_A ");
		super.content();
	}
}

class Brand_B extends Content {
	@Override
	void content() {
		System.out.println("content for brand_B ");
		super.content();
	}
}

class Brand_C extends Content {
	@Override
	void content() {
		System.out.println("content for brand_C ");
		super.content();
	}

}

public class Content_screen_type {

	public static void main(String[] args) {
		Screen_A screen_a = new Screen_A();
		Screen_B screen_b = new Screen_B();
		Screen_C screnn_c = new Screen_C();
		Brand_A brand_a = new Brand_A();
		Brand_B brand_b = new Brand_B();
		Brand_C brand_C = new Brand_C();
		screen_a.content();
		screen_b.content();
		screnn_c.content();
		brand_a.content();
		brand_b.content();
		brand_C.content();

	}

}
