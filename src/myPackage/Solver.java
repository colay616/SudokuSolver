package myPackage;


public class Solver {
	int[][][] form = new int[10][10][10];
	public Solver(int[][][] formIn){
		new Copy1To2(formIn, form);
		System.out.println("ԭ��Ŀ����ʣ��"+new Sudoku(form).countBlank()+"���ո�");
		new Sudoku(form).printInfo();
		
		
		//�ȶ�ԭ��Ŀ����һ���ų�
		Sudoku mySD = new Sudoku(form);
		if(mySD.check()==true){
			new Copy1To2(mySD.getShuDu(),form);
			//System.out.println("��Ŀδ�������");
		
			// /****�����������
			long time = System.currentTimeMillis();
			for(int i=0;i<99;i++){
				//ִ�������1
				Algorithm_1 myAl_1 = new Algorithm_1(form);
				Sudoku myAl_1SD = new Sudoku(myAl_1.getForm());
				if(myAl_1SD.check()==true){
					new Copy1To2(myAl_1SD.getShuDu(), form);
					//System.out.println("�����1����");
				}
				else{
					System.out.println("�����1�쳣�����ƺ���Ŀ�޽�");
					System.exit(0);
				}
				//ִ�������2
				Algorithm_2 myAl_2 = new Algorithm_2(form);
				Sudoku myAl_2SD = new Sudoku(myAl_2.getForm());
				if(myAl_2SD.check()==true){
					new Copy1To2(myAl_2SD.getShuDu(), form);
					//System.out.println("�����2����");
				}
				else{
					System.out.println("�����2�쳣�����ƺ���Ŀ�޽�");
					System.exit(0);
				}
				new Copy1To2(new Algorithm_2(form).getForm(), form) ;
			
				if(new Sudoku(form).countBlank()==0){
					//System.out.println("��ִ��"+ (i+1) +"��ѭ��");
					break;
				}
			}
			// ****/�����������
		
			System.out.println("\n[���������]����������ʣ��"+new Sudoku(form).countBlank()+"���ո�");
			new Sudoku(form).printInfo();
			time = System.currentTimeMillis()-time;
			System.out.println("��ʱ"+time+"����");
		}
		else{
			System.out.println("��Ŀ�����ԵĴ�������");
		}
		
	}

}
