package com.personal;

public class Calculator {
	
	public Integer addition(int prm1, int prm2) {
		System.out.println("Inside addition");
		System.out.println("prm1 = "+ prm1);
		System.out.println("prm2 = "+ prm2);
		//prm2 = 100;
		int result = prm1 + prm2;
		return result;
		
	}
	
	public Integer addition(int prm1, int prm2, int prm3) {
		
		System.out.println("Overloading addition");
		int ans = prm1+prm2+prm3;
		System.out.println("Overloaded result = "+ ans );
		return ans;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Begining from here");
		Calculator cal = new Calculator();
		System.out.println("Obj of Calculator created");
		int x = 5;
		int y = 10;
		int ans = cal.addition(x,y);            //call by reference
		int ans1 = cal.addition(11,22,33);      // call by value
		
//		System.out.println("x = "+ x);
//		System.out.println("y = "+ y);
		
		System.out.println("The answer is------> " + ans);
		System.out.println("The answer is------> " + ans1);
		
		

	}

}
