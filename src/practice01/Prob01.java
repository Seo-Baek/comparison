package practice01;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "���� �Է��Ͻʽÿ� : " );
		int number = scanner.nextInt();
		
		if( number % 3 == 0 ) {
			System.out.println( "3�� ����Դϴ�." );
		}
		
		scanner.close();
		
		
//		Scanner scanner = new Scanner( System.in );
//		System.out.print("���� �Է��Ͻʽÿ� : ");
//		int number = scanner.nextInt();
//		
//		if(number % 3 == 0) {
//			System.out.println("3�� ����Դϴ�.");
//		} else {
//			System.out.println("3�� ����� �ƴմϴ�.");
//		}
//		
//		scanner.close();
	}
}
