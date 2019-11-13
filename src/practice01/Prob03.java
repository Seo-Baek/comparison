package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print( "숫자를 입력하세요: " );
			
			int number = scanner.nextInt();
			int sum = 0;

			for (int i = 0; i <= number; i++) {
				if (number % 2 == 0 && i % 2 == 0 || number % 2 != 0 && i % 2 != 0) {
					sum += i;
				}
			}

			System.out.println("결과값: " + sum);
		}
		
		
		
//		Scanner scanner = new Scanner (System.in);
//		
//		while(true) {
//			System.out.print("숫자를 입력하세요: ");
//			int number = scanner.nextInt();
//			
//				if(number % 2 != 0) {
//					int sum1 = 0;
//					for(int i = number; i >=0 ; i = i-2) {
//					sum1 += i;
//					}
//					System.out.println("결과 값 : " + sum1);
//					
//				} else {
//					int sum2 = 0;
//					for(int i = number; i >=0 ; i = i-2) {
//					sum2 += i;
//					
//					}
//					System.out.println("결과 값 : " + sum2);
//				
//				
//				}
//				
//			
//		}
		
		
	}

}
