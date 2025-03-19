package A;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = insert.nextInt();

        // 위쪽 삼각형 (피라미드)
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n - a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a * 2 - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 삼각형 (역피라미드)
        for (int a = n - 1; a >= 1; a--) {
            for (int b = 1; b <= n - a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a * 2 - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        insert.close(); // Scanner 닫기
        // 코드 설명 추가
    }
}