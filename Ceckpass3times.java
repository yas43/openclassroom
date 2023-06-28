package com.yaser;

import java.util.Scanner;

public class Ceckpass3times {
	static int input = 4;
	static boolean isAuthenticated = false;
	public static void main(String[] args) {
	for(int i=0;i<input;i++) {
		System.out.println("enter password");
		Scanner enter_pass = new Scanner(System.in);
		int pass = enter_pass.nextInt();
		if(pass == 4) {
			System.out.println("hello\nyouenter to your space");
			isAuthenticated = true;
			break;
		}
		if(i==3) 
		break;
		else
			System.out.println("retry again");
		}
		if(isAuthenticated==false) {
			System.out.println("access denied");
		}
	}
}
