package jpt;

import java.util.Scanner;

import exception.jptException;

public class jptTest {
	public static void main(String[] args) throws jptException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("일본어로 자기소개를 해보세요..");
//		String selfIntroduce = scan.next();
		String selfIntroduce = null;
		
		testJpt(selfIntroduce);
		
	}
	
	private static void testJpt(String selfIntroduce) throws jptException {
		
		// null check 필수!!
		if( null != selfIntroduce) {
			if ( 100 > selfIntroduce.length()) {
				throw new jptException();
			} else {
				System.out.println("JPT so...");
			}
		} 
	}
}
