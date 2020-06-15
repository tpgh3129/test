package javatext;
import java.util.*;
import java.text.*;

public class BankAccount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
				
		int account = 10000;
		int money = 0;
		String price = "";
		NumberFormat nf = NumberFormat.getInstance();
		
		System.out.println("계좌 123-456789 (예금주 : 홍길동)");
		price = nf.format(account);
		System.out.println("잔액 : "+ price + "원");
		
		while(true) {
			
			String bankwork = input.nextLine();
			String intStr = bankwork.replaceAll("[^\\d]", "");
			money = Integer.parseInt(intStr);
			
			if(bankwork.contains("입금")) {
				if(money >= 0) { account += money; }
				price = nf.format(account);
				System.out.println("잔액 : "+ price + "원");
	        }
			else if(bankwork.contains("출금")) {
				if(money >= 0) { account -= money; }
				price = nf.format(account);
				if(account < 0) {
					System.out.println("[에러] 잔액이 부족합니다.");
					break;
				}
				else {System.out.println("잔액 : "+ price + "원"); }
	        }
			else {System.out.println("다시 입력해주십시오.");}
			
		}
		
	}
}
