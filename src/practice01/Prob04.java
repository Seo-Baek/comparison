package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();

		int length = text.length();
		for( int i = 0; i < length; i++ ) {
			for( int j = 0; j <= i; j++ ) {
				System.out.print( text.charAt( j ) );
			}
			
			System.out.println( "" );
		}
		
		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("문자열을 입력하세요 : ");
//		String text = scanner.nextLine();
//
//		int len = text.length();
//		for(int i = 0; i < len; i++) {
//			for(int j =0; j < i+1; j++) {
//				char c = text.charAt(j);    //메쏘드로 객체에게 명령을 내린것
//				System.out.print(c);
//			}
//			System.out.println("");
//		}
		

//		scanner.close();
		
	}
}