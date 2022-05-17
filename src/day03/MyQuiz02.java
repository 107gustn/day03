package day03;

import java.util.Scanner;

public class MyQuiz02 {
	public static void main(String[] args) {
		
		/*
		짜장면과 짬뽕을 주문 받아서 처리하는 영수증 프로그램

		짜장면 : 5500원
		짬뽕 : 6000원
		5그릇 이상 주문 : 3천원 할인
		10그릇 이상 주문 : 10% 할인

		짜장면 주문 갯수 : x 그릇
		짬뽕 주문 갯수 : y 그릇

		******주문 내용******
		[짜장면]
		가격 : 5500원
		주문 : x 그릇

		[짬뽕면]
		가격 : 6000원
		주문 : y 그릇

		(할인 받을시) 할인 금액 : ___원
		지불 금액 : ___원
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int zzangPrice = 5500, zzamPrice = 6000;
		int zzangCount, zzamCount, totalPrice, dc = 0;
		
		System.out.print("짜장면 주문 갯수 : ");
		zzangCount = sc.nextInt();
		
		System.out.print("짬뽕 주문 갯수 : ");
		zzamCount = sc.nextInt();
		
		totalPrice = ((zzangCount * zzangPrice) + (zzamCount * zzamPrice));
		
		if((zzangCount + zzamCount) >= 10) {
			dc = totalPrice/10;
			totalPrice = totalPrice - dc;
		}else if((zzangCount + zzamCount) >= 5){
			dc = 3000;
			totalPrice = totalPrice - dc;
		}
		
		System.out.println("\n*****주문 내용 영수증*****");
		System.out.println("[짜장면]");
		System.out.println("가격 : " + zzangPrice + "원");
		System.out.println("주문 : " + zzangCount + " 그릇\n");
		
		System.out.println("[짬뽕]");
		System.out.println("가격 : " + zzamPrice + "원");
		System.out.println("주문 : " + zzamCount + " 그릇\n");
		
		if((zzangCount + zzamCount) >= 5) {
			System.out.println("할인 금액 : " + dc + " 원");
			System.out.println("지불 금액 : " + totalPrice + " 원");
		}else {
			System.out.println("지불 금액 : " + totalPrice + " 원");
		}
		
		
		
		
				
		
	}

}
