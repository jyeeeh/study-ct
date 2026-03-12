package baekjoon.step01;

import java.util.Scanner;

/**
 * 백준 2753번 - 윤년
 * 난이도: 브론즈 5
 * 문제: 연도가 주어졌을 때, 윤년이면 1 아니면 0을 출력하세요.
 *
 * 윤년 조건:
 *   - 4의 배수이면서 100의 배수가 아닌 경우
 *   - 또는 400의 배수인 경우
 */
public class P2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 연도 입력

        // 400의 배수이거나, 4의 배수이면서 100의 배수가 아니면 윤년
        if(a%400==0 || (a%4==0 && a%100!=0)) System.out.println(1);
        else System.out.println(0);
    }
}
