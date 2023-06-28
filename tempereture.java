package scope;

import java.util.Scanner;

public class tempereture {

	public static void main(String[] args) {
		System.out.println("what is thr tempreture ?");
		Scanner tempreture = new Scanner(System.in);
		int actual_temp = tempreture.nextInt();
		if (actual_temp < 10)
			System.out.println("it's cold wear warms cloths");
		else if (actual_temp > 10 && actual_temp < 30)
			System.out.println("nice weather enjo it !!");
		else
			System.out.println("it's warm drink water");
	
		
	
	}
}
