package day03;

import java.util.Scanner;

public class QuizTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	      int num; 
	      System.out.println("����� Ű�� �� cm�Դϱ�?");
	      num = input.nextInt();
	      if(num > 110) {
	      System.out.println("110cm �̻��Դϴ� ž�°����մϴ�");
	      }else if(num < 110) {
	      System.out.println("110cm �̸��Դϴ� ��ȣ�ڿ� �Բ� ž���Ͻʽÿ�");
	      System.out.println("��ȣ�ڰ� �ֽ��ϱ�? 1:�� 2:�ƴϿ�");
	      num = input.nextInt();
	      if(num == 1) {
	         System.out.println("ž�� �����մϴ�");
	         num = input.nextInt();
	      }else if(num == 2) {
	         System.out.println("ž�� �Ұ����մϴ� ��ȣ�ڶ� �Բ�������");
	      }else {
	         System.out.println("�ٽ� �Է����ּ���");
	         }
	      }


	}

}
