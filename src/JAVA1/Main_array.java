package JAVA1;

import java.util.Scanner;

public class Main_array {

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
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
//		double rate1 = 0.5;
//		double rate2 = 0.3;
//		double rate3 = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
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
