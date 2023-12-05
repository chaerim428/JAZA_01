package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.EvenOrOdd;
import com.javalec.function.SumEvenOdd;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);   //스캐너 클래스 불러오기
		SumEvenOdd evenOdd = new SumEvenOdd();		//SumEvenOdd 클래스 불러오기
		EvenOrOdd evenOrOdd = new EvenOrOdd();			//EveOdd 클래스 불러오기
		
		int firstNum = 0;
		int secondNum = 0;
		int sum = 0;
		
		System.out.print("첫번째 정수를 입력하여주세요 : ");
		firstNum = scanner.nextInt();
		
		System.out.print("두번째 정수를 입력하여주세요 : ");
		secondNum = scanner.nextInt();
		
		sum = evenOdd.sumCalc(firstNum, secondNum);
		System.out.println("첫번째 정수 : " + firstNum + " 두번째 정수 : " + secondNum 
					+ " 합은 : " + sum);
		
		
		System.out.println(evenOrOdd.evenOdd(sum));
		
	}

}