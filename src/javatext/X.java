package javatext;
import java.util.Scanner;

public class X {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.printf("±¸±¸´Ü  :");
		
		int a = input.nextInt();
		input.close();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(a + "*" + i + "=" + a * i);
		}
		
		
		

	}
}
