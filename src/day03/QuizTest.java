package day03;

import java.util.Scanner;

public class QuizTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	      int num; 
	      System.out.println("당신의 키는 몇 cm입니까?");
	      num = input.nextInt();
	      if(num > 110) {
	      System.out.println("110cm 이상입니다 탑승가능합니다");
	      }else if(num < 110) {
	      System.out.println("110cm 미만입니다 보호자와 함께 탑승하십시오");
	      System.out.println("보호자가 있습니까? 1:예 2:아니오");
	      num = input.nextInt();
	      if(num == 1) {
	         System.out.println("탑승 가능합니다");
	         num = input.nextInt();
	      }else if(num == 2) {
	         System.out.println("탑승 불가능합니다 보호자랑 함께오세요");
	      }else {
	         System.out.println("다시 입력해주세요");
	         }
	      }


	}

}
