package com.javalec.function;

public class EvenOrOdd {
	// Field
	
	// Constructor
	public EvenOrOdd() {
		
	}
	
	// Method
	// 합계가 짝수인지 홀수인지 판단
	public String evenOdd(int sum) {
		String result = "";
		if(sum % 2 == 0) {
			System.out.println("짝수 입니다");
		}else {
			System.out.println("홀수 입니다");
		}
		return result;
	}
}
