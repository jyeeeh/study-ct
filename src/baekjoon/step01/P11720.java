package baekjoon.step01;

import java.util.Scanner;

/**
 * 백준 11720번 - 숫자의 합
 * 난이도: 브론즈 5
 * 문제: N개의 숫자가 공백 없이 주어질 때, 모두 합해서 출력하세요.
 *
 * 입력:
 *   - 첫째 줄: 숫자의 개수 N (1 ≤ N ≤ 100)
 *   - 둘째 줄: N개의 숫자 (공백 없이)
 *
 * 출력:
 *   - N개의 숫자의 합
 */
public class P11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int sum = 0;

        for(int i=0;i<n;i++){
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
