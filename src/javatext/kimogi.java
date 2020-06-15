package javatext;
import java.util.Scanner;

public class kimogi {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("+---------------------------------------+");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("+---------------------------------------+");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

	//���»����ϱ�
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("���»���");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();

		System.out.print("������: ");
		String owner = scanner.next();

		System.out.print("�ʱ��Աݾ�: ");
		int money = scanner.nextInt();

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, money);
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
		//�ۼ� ��ġ
	

	//���¸�Ϻ���
	private static void accountList() {
		System.out.println("--------");
		System.out.println("���¸��");
		System.out.println("--------");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}
		//�ۼ� ��ġ
	

	//�����ϱ�
	private static void deposit() {
		
			System.out.println("--------");
			System.out.println("����");
			System.out.println("--------");
			System.out.print("���¹�ȣ: ");
			String ano = scanner.next();
			System.out.print("���ݾ�: ");
			int dep = scanner.nextInt();

			if (findAccount(ano) == null) {
				System.out.println("�Է��� ���¹�ȣ�� ã�� ���߽��ϴ�.");
			} else {
				findAccount(ano).setBalance(findAccount(ano).getBalance() + dep);
				System.out.println("���: �Ա��� �����Ǿ����ϴ�.");
			}
			
		}
		//�ۼ� ��ġ, findAccountȣ���ؼ� �̿�		
	

	//����ϱ�
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("���");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("��ݾ�: ");
		int withd = scanner.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("�Է��� ���¹�ȣ�� ã�� ���߽��ϴ�.");
		} else {
			if (withd > findAccount(ano).getBalance()) {
				System.out.println("�ܾ׺��� ū �׼��� �Է��ϼ̽��ϴ�.");
			} else {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - withd);
				System.out.println("���: ����� �����Ǿ����ϴ�.");
			}
		}
		//�ۼ� ��ġ, findAccountȣ���ؼ� �̿�
	}

	//Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
		//�ۼ� ��ġ
	}
}