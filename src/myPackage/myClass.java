package myPackage;

import java.util.Scanner;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testStr = "";
		
		System.out.println("========����========\nhuidexuan@foxmail.com");
		do{
			if(testStr==""){
				System.out.println("��������Ŀ��");
				System.out.println("���磺008507000000000010002000060005000008600010030000000000130000000000800000000400205");
			}
			else System.out.println("��Ŀ�������������������Ŀ��");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			testStr = scan.nextLine();
		}
		while(new Sudoku().checkStr(testStr)==false);
		
		new Solver(new Sudoku().StrToForm(testStr));
	}

}
