
package javatext;

import java.util.Scanner;

public class hot {

	public static void main(String[] args) {

		double C;

		Scanner sc = new Scanner(System.in);

		System.out.printf("¼·¾¾ : ");

		C = sc.nextDouble();

		double f = (double) 9 / 5 * C + 32;

		System.out.printf("È­¾¾ : %.1f", f);

	}

}