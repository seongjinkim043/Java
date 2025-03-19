package A;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int num = scan.nextInt();
		for ( int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n ", num, i, (num*i));
		}
		System.out.println("프로그램 종료");
		
		

		for ( int i = 2; i < 10; i++) {
			System.out.println(i + "단을 출력 합니다.");
            
			for ( int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
			System.out.println();
		}
	}
}
