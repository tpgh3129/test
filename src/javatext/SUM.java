package javatext;

import java.util.Scanner;


public class SUM {

	   public static void main(String[] args) {
		   int[] score = new int[4];
		   float sum = 0;
		  
		   Scanner input = new Scanner(System.in);
		   
		   for(int i =0; i < score.length; i++)
		   {
			   System.out.print("���� ���� �Է� :");
			   score[i] = input.nextInt();
			   sum=sum+score[i];
			   }
		   {
			   System.out.println("�����հ� :" + sum);
			   System.out.println("��ռ����� : " + (sum/score.length));;
		   }
	   }
}