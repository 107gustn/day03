package day03;

import java.util.Scanner;

public class MyQuiz01 {

	public static void main(String[] args) {
		
		//주사위 2개의 결과값을 입력 후
		//두 눈의 합이 짝수면 짝수!, 홀수면 홀수!
		//두 눈이 같은 수면 더블!! 을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int fnum, snum, tnum;
		
		System.out.print("첫번째 주사위 결과 입력 : ");
		fnum = sc.nextInt();
		
		System.out.print("두번째 주사위 결과 입력 : ");
		snum = sc.nextInt();
		
		tnum = fnum + snum;
		if(fnum < 7 && snum < 7) {
			if(tnum % 2 == 0) {
				if(fnum == snum) {
					System.out.println("더블!");
				}else {
					System.out.println("짝수");
				}
			}else {
				System.out.println("홀수");
			}
		}else {
			System.out.println("결과를 다시 입력하세요.");
		}

	}

}
