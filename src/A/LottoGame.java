package A;

import java.util.Random;
import java.util.Scanner;

public class LottoGame {

	private int[] lottoNumbers; // 랜덤 당첨 번호
	private int[] userNumbers; // 사용자가 입력한 번호
	private int[] matchedNumbers; // 당첨된 번호 저장
	private int matchCount; // 맞춘 개수
	private static final int SIZE = 6; // 로또 번호 개수
	private static final int MAX_NUMBER = 45; // 로또 번호 범위

	public LottoGame() {
		lottoNumbers = new int[SIZE];
		userNumbers = new int[SIZE];
		matchedNumbers = new int[SIZE];
		matchCount = 0;
	}

	// 🚀 랜덤한 로또 번호 생성 (중복 제거)
	private void generateLottoNumbers() {
		Random rand = new Random();
		for (int i = 0; i < SIZE; i++) {
			int number;
			boolean isDuplicate;
			do {
				number = rand.nextInt(MAX_NUMBER) + 1;
				isDuplicate = false;
				for (int j = 0; j < i; j++) {
					if (lottoNumbers[j] == number) {
						isDuplicate = true;
						break;
					}
				}
			} while (isDuplicate);
			lottoNumbers[i] = number;
		}
	}

	// 🚀 사용자 번호 입력 및 중복 제거
	public boolean inputUserNumbers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("로또 번호 6개를 입력해주세요 (쉼표로 구분) :");
		String input = scan.nextLine();
		String[] parts = input.split(",");

		int count = 0;
		for (String part : parts) {
			int num = Integer.parseInt(part.trim());

			// 범위 검사
			if (num < 1 || num > MAX_NUMBER) {
				System.out.println("⚠ 1~45 사이의 숫자만 입력 가능합니다: " + num);
				return false;
			}

			// 중복 검사
			boolean isDuplicate = false;
			for (int j = 0; j < count; j++) {
				if (userNumbers[j] == num) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				userNumbers[count++] = num;
			}

			if (count == SIZE)
				break;
		}

		if (count < SIZE) {
			System.out.println("⚠ 중복된 숫자를 제외하고 6개의 숫자를 입력해야 합니다.");
			return false;
		}
		return true;
	}

	// 🚀 당첨 확인
	private void checkWinningNumbers() {
		matchCount = 0;
		for (int userNum : userNumbers) {
			for (int lottoNum : lottoNumbers) {
				if (userNum == lottoNum) {
					matchedNumbers[matchCount++] = userNum;
					break;
				}
			}
		}
	}

	// 🚀 게임 실행
	public void play() {
		generateLottoNumbers();
		checkWinningNumbers();
		displayResults();
	}

	// 🚀 결과 출력
	private void displayResults() {
		System.out.print("입력한 번호: ");
		printArray(userNumbers);

		System.out.print("로또 당첨 번호: ");
		printArray(lottoNumbers);

		if (matchCount > 0) {
			System.out.print("당첨된 번호: ");
			for (int i = 0; i < matchCount; i++) {
				System.out.print(matchedNumbers[i] + " ");
			}
			System.out.println();
		} else {
			System.out.println("아쉽지만 당첨된 번호가 없습니다.");
		}

		System.out.printf("🎉 축하합니다! %d개 맞았습니다.%n", matchCount);
	}

	// 🚀 배열 출력 함수
	private void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
