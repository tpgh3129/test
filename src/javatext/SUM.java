package javatext;

import java.util.Scanner;


public class SUM {

	   public static void main(String[] args) {
		   int[] score = new int[4];
		   float sum = 0;
		  
		   Scanner input = new Scanner(System.in);
		   
		   for(int i =0; i < score.length; i++)
		   {
			   System.out.print("과목 점수 입력 :");
			   score[i] = input.nextInt();
			   sum=sum+score[i];
			   }
		   {
			   System.out.println("점수합계 :" + sum);
			   System.out.println("평균성적은 : " + (sum/score.length));;
		   }
	   }
}