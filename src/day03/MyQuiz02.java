package day03;

import java.util.Scanner;

public class MyQuiz02 {
	public static void main(String[] args) {
		
		/*
		¥���� «���� �ֹ� �޾Ƽ� ó���ϴ� ������ ���α׷�

		¥��� : 5500��
		«�� : 6000��
		5�׸� �̻� �ֹ� : 3õ�� ����
		10�׸� �̻� �ֹ� : 10% ����

		¥��� �ֹ� ���� : x �׸�
		«�� �ֹ� ���� : y �׸�

		******�ֹ� ����******
		[¥���]
		���� : 5500��
		�ֹ� : x �׸�

		[«�͸�]
		���� : 6000��
		�ֹ� : y �׸�

		(���� ������) ���� �ݾ� : ___��
		���� �ݾ� : ___��
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int zzangPrice = 5500, zzamPrice = 6000;
		int zzangCount, zzamCount, totalPrice, dc = 0;
		
		System.out.print("¥��� �ֹ� ���� : ");
		zzangCount = sc.nextInt();
		
		System.out.print("«�� �ֹ� ���� : ");
		zzamCount = sc.nextInt();
		
		totalPrice = ((zzangCount * zzangPrice) + (zzamCount * zzamPrice));
		
		if((zzangCount + zzamCount) >= 10) {
			dc = totalPrice/10;
			totalPrice = totalPrice - dc;
		}else if((zzangCount + zzamCount) >= 5){
			dc = 3000;
			totalPrice = totalPrice - dc;
		}
		
		System.out.println("\n*****�ֹ� ���� ������*****");
		System.out.println("[¥���]");
		System.out.println("���� : " + zzangPrice + "��");
		System.out.println("�ֹ� : " + zzangCount + " �׸�\n");
		
		System.out.println("[«��]");
		System.out.println("���� : " + zzamPrice + "��");
		System.out.println("�ֹ� : " + zzamCount + " �׸�\n");
		
		if((zzangCount + zzamCount) >= 5) {
			System.out.println("���� �ݾ� : " + dc + " ��");
			System.out.println("���� �ݾ� : " + totalPrice + " ��");
		}else {
			System.out.println("���� �ݾ� : " + totalPrice + " ��");
		}
		
		
		
		
				
		
	}

}
