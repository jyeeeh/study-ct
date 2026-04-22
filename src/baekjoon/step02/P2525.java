package baekjoon.step02;

import java.util.Scanner;

/**
 * 백준 2525번 - 오븐 시계
 * 난이도: 브론즈 1
 * 문제: 현재 시각 H시 M분에서 요리 시간 C분 후의 시각을 출력하세요.
 *
 * 입력:
 *   - 첫째 줄: H M (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
 *   - 둘째 줄: C (0 ≤ C ≤ 1000)
 *
 * 출력:
 *   - C분 후의 H M 출력 (한 줄, 공백 구분)
 *   - M + C >= 60 이면 시간 증가, 분은 (M + C) % 60
 *   - H가 23을 초과하면 H는 (H + 증가분) % 24
 */
public class P2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int afterMinuteC = sc.nextInt();

        int printHour = 0;
        int printMinute = 0;

        int sumMinute = minute + afterMinuteC;

        printHour = (hour + sumMinute / 60) % 24 ;
        printMinute = sumMinute % 60;

        System.out.println(printHour+" "+printMinute);

    }
}