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
		
		System.out.println("���� 123-456789 (������ : ȫ�浿)");
		price = nf.format(account);
		System.out.println("�ܾ� : "+ price + "��");
		
		while(true) {
			
			String bankwork = input.nextLine();
			String intStr = bankwork.replaceAll("[^\\d]", "");
			money = Integer.parseInt(intStr);
			
			if(bankwork.contains("�Ա�")) {
				if(money >= 0) { account += money; }
				price = nf.format(account);
				System.out.println("�ܾ� : "+ price + "��");
	        }
			else if(bankwork.contains("���")) {
				if(money >= 0) { account -= money; }
				price = nf.format(account);
				if(account < 0) {
					System.out.println("[����] �ܾ��� �����մϴ�.");
					break;
				}
				else {System.out.println("�ܾ� : "+ price + "��"); }
	        }
			else {System.out.println("�ٽ� �Է����ֽʽÿ�.");}
			
		}
		
	}
}
