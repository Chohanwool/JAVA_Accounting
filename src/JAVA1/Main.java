package JAVA1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("공급가를 입력하세요 : ");
		double valueOfSupply = sc.nextDouble();
		double varRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*varRate;
		double total = valueOfSupply + valueOfSupply*varRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT :  " + vat);
		System.out.println("TOTAL :  " + total);
		System.out.println("EXPENSE :  " + expense);
		System.out.println("INCOME :  " + income);
		System.out.println("DIVIDEND 1 : " + dividend1);
		System.out.println("DIVIDEND 2 : " + dividend2);
		System.out.println("DIVIDEND 3 : " + dividend3);
		
		
	}

}
