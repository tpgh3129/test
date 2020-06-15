package javatext;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.printf("Enter line number :");
		int c = input.nextInt();

		input.close();

		for (int i = 1; i <= c; i++) {
			System.out.println("");
			for (int j = 0; j < i; j++) {
				System.out.printf("*");

			}
		}

	}
}
