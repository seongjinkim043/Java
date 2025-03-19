package A;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int[] kuji = new int[6];
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < lotto.length; i++) {
			int number = rand.nextInt(45) + 1;
			lotto[i] = number;
		}
		
		System.out.println("로또 번호 6개를 입력해주세요 :");
        String input = scan.nextLine(); // 한 줄 입력
        String[] parts = input.split(",");
		
		for (int i = 0; i < kuji.length; i++) {
			kuji[i] = Integer.parseInt(parts[i]);
		}
		
		int matchCount = 0;
		for (int i = 0; i < kuji.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				if (kuji[i] == lotto[j]) {
					matchCount++;
					break;
				}
			}
		}
		System.out.printf("축하합니다 %d개 맞았습니다.", matchCount);
	}
}