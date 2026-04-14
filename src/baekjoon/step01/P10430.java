package baekjoon.step01;

import java.util.Scanner;

/**
 * 백준 10430번 - 나머지
 * 난이도: 브론즈 5
 * 문제: (A+B)%C, ((A%C)+(B%C))%C, (A*B)%C, ((A%C)*(B%C))%C 를 출력하세요.
 *
 * 입력:
 *   - 첫째 줄: A, B, C (1 ≤ A, B, C ≤ 10000)
 *
 * 출력:
 *   - 위 4가지 결과를 각각 한 줄씩 출력
 */
public class P10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A * B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}

