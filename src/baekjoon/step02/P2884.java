package baekjoon.step02;

import java.util.Scanner;

/**
 * 백준 2884번 - 알람 시계
 * 난이도: 브론즈 2
 * 문제: H시 M분에 울리는 알람을 45분 앞당긴 시각을 출력하세요.
 *
 * 입력:
 *   - 첫째 줄: H M (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
 *
 * 출력:
 *   - 45분 앞당긴 H M 출력
 *   - M < 45 이면 시간도 1 감소, M은 (M + 60 - 45)
 *   - H가 0이고 M < 45 이면 H는 23
 */
public class P2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int printHour = 0;
        int printMinute = 0;

        if(minute < 45){
            printHour = hour - 1;
            printMinute = minute + 60 - 45;
            if(hour == 0) printHour = 23;
            System.out.println(printHour+" "+printMinute);
        } else {
            printHour = hour;
            printMinute = minute - 45;
            System.out.println(printHour+" "+printMinute);
        }
    }
}