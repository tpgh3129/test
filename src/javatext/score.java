package javatext;
import java.util.Scanner;
public class score {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("점수 입력 : ");
		
		int c = input.nextInt();
		
     	input.close();		
     	
     	if(c >= 90) {
     		System.out.println("A");
     		
     	}else if(c >= 80) {
     		System.out.println("B");
     	}else if(c >= 70) {
       		System.out.println("C");
     	}else if(c >= 60) {
     		System.out.println("D");
     	}else {
     		System.out.println("F");
     	}
     		
	}

}
