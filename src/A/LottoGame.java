package A;

import java.util.Random;
import java.util.Scanner;

public class LottoGame {
    private int[] lottoNumbers;  // 랜덤 당첨 번호
    private int[] userNumbers;   // 사용자가 입력한 번호
    private int[] matchedNumbers; // 당첨된 번호 저장
    private int matchCount;       // 맞춘 개수
    private static final int SIZE = 6; // 로또 번호 개수
    private static final int MAX_NUMBER = 45; // 로또 번호 범위

    public LottoGame() {
        lottoNumbers = new int[SIZE];
        userNumbers = new int[SIZE];
        matchedNumbers = new int[SIZE];
        matchCount = 0;
    }

    // 🚀 중복 없이 랜덤한 숫자 배열 생성 (로또 & 사용자 입력 공통 사용)
    private int[] generateUniqueNumbers(int size, int maxValue, boolean isUserInput) {
        int[] numbers = new int[size];
        int count = 0;
        Random rand = new Random();
        Scanner scan = isUserInput ? new Scanner(System.in) : null;

        while (count < size) {
            int number;

            if (isUserInput) {
                try {
                    number = scan.nextInt(); // 사용자가 입력한 숫자

                    // 🚨 숫자 범위 검사 (1~45)
                    if (number < 1 || number > maxValue) {
                        System.out.println("⚠ 1~45 사이의 숫자만 입력하세요: " + number);
                        continue;
                    }

                } catch (Exception e) {
                    System.out.println("⚠ 잘못된 입력입니다. 숫자만 입력하세요.");
                    scan.next(); // 잘못된 입력 제거
                    continue;
                }
            } else {
                number = rand.nextInt(maxValue) + 1; // 랜덤 번호 생성
            }

            // 🚨 중복 검사
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (numbers[j] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                numbers[count++] = number;
            }
        }

        return numbers;
    }

    // 🚀 사용자 번호 입력
    public boolean inputUserNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("로또 번호 6개를 입력해주세요 (쉼표 없이 공백으로 구분) :");
        userNumbers = generateUniqueNumbers(SIZE, MAX_NUMBER, true);
        return true;
    }
    // 🚀 로또 번호 생성
    private void generateLottoNumbers() {
        lottoNumbers = generateUniqueNumbers(SIZE, MAX_NUMBER, false);
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
