package day03;

import java.util.Scanner;

public class MyQuiz01 {

	public static void main(String[] args) {
		
		//�ֻ��� 2���� ������� �Է� ��
		//�� ���� ���� ¦���� ¦��!, Ȧ���� Ȧ��!
		//�� ���� ���� ���� ����!! �� ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		int fnum, snum, tnum;
		
		System.out.print("ù��° �ֻ��� ��� �Է� : ");
		fnum = sc.nextInt();
		
		System.out.print("�ι�° �ֻ��� ��� �Է� : ");
		snum = sc.nextInt();
		
		tnum = fnum + snum;
		if(fnum < 7 && snum < 7) {
			if(tnum % 2 == 0) {
				if(fnum == snum) {
					System.out.println("����!");
				}else {
					System.out.println("¦��");
				}
			}else {
				System.out.println("Ȧ��");
			}
		}else {
			System.out.println("����� �ٽ� �Է��ϼ���.");
		}

	}

}
