package com.caseih;

public class Test {

	public static void main(String[] args) {

		String symbol = "*";
		int numbersOfRows = 5;

		System.out.println("Fisrt piramid");
		for (int i = 1; i <= numbersOfRows; i++) {
			System.out.println(symbol.repeat(i));
		}
		System.out.println();

		System.out.println("Second piramid");
		for (int i = numbersOfRows; i > 0; i--) {
			System.out.println(symbol.repeat(i));
		}
		System.out.println();

		System.out.println("Third piramid");
		char[] spase = new char[(numbersOfRows * 2)];
		for (int i = 0; i < numbersOfRows; i++) {
			spase[(spase.length / 2) + i] = symbol.charAt(0);
			spase[(spase.length / 2) - i] = symbol.charAt(0);
			System.out.println(spase);
		}
		System.out.println();

		System.out.println("Fourth piramid");
		for (int i = 0; i < numbersOfRows / 2; ++i) {
			for (int j = 0; j <= i; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		for (int i = numbersOfRows / 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}

	}

}
