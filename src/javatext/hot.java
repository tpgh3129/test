
package javatext;

import java.util.Scanner;

public class hot {

	public static void main(String[] args) {

		double C;

		Scanner sc = new Scanner(System.in);

		System.out.printf("���� : ");

		C = sc.nextDouble();

		double f = (double) 9 / 5 * C + 32;

		System.out.printf("ȭ�� : %.1f", f);

	}

}