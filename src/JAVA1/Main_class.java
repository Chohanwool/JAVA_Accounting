package JAVA1;

import java.util.Scanner;

class Accounting{
	public  double valueOfSupply;
	public  double varRate;
	public  double expenseRate;
	
	public  void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT :  " + getVAT());
		System.out.println("TOTAL :  " + getTotal());
		System.out.println("EXPENSE :  " + getExpense());
		System.out.println("INCOME :  " + getIncome());
		System.out.println("DIVIDEND 1 : " + getDividend1());
		System.out.println("DIVIDEND 2 : " + getDividend2());
		System.out.println("DIVIDEND 3 : " + getDividend3());
	}

	public  double getDividend1() {
		return getIncome() * 0.5;
	}
	public  double getDividend2() {
		return getIncome() * 0.3;
	}
	public  double getDividend3() {
		return getIncome() * 0.2;
	}

	public  double getIncome() {
		return valueOfSupply - getExpense();
	}

	public  double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

	public  double getVAT() {
		return valueOfSupply*varRate;
	}
	
	
}

public class Main_class {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("공급가를 입력하세요 : ");
//		Accounting.valueOfSupply = sc.nextDouble();
//		Accounting.varRate = 0.1;
//		Accounting.expenseRate = 0.3;
//		
//		Accounting.print();

		Accounting acc01 = new Accounting();
		acc01.valueOfSupply = 10000.0;
		acc01.varRate = 0.05;
		acc01.expenseRate = 0.5;
		
		acc01.print();
	}
	
}
	

