package JAVA1;

import java.util.Scanner;

public class Main_method {
	
	public static double valueOfSupply;
	public static double varRate = 0.1;
	public static double expenseRate;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("공급가를 입력하세요 : ");
		valueOfSupply = sc.nextDouble();
		
		expenseRate = 0.3;
		
		
		double vat = getVAT();
		double total = getTotal();
		double expense = getExpense();
		double income = getIncome();
		
		double dividend1 = getDividend1();
		double dividend2 = getDividend2();
		double dividend3 = getDividend3();
		
		print();
		
		
	}

	public static void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT :  " + getVAT());
		System.out.println("TOTAL :  " + getTotal());
		System.out.println("EXPENSE :  " + getExpense());
		System.out.println("INCOME :  " + getIncome());
		System.out.println("DIVIDEND 1 : " + getDividend1());
		System.out.println("DIVIDEND 2 : " + getDividend2());
		System.out.println("DIVIDEND 3 : " + getDividend3());
	}

	public static double getDividend1() {
		return getIncome() * 0.5;
	}
	public static double getDividend2() {
		return getIncome() * 0.3;
	}
	public static double getDividend3() {
		return getIncome() * 0.2;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	public static double getVAT() {
		return valueOfSupply*varRate;
	}

}
