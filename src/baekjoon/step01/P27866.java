package baekjoon.step01;

import java.util.Scanner;

/**
 * 백준 27866번 - 문자와 문자열
 * 난이도: 브론즈 5
 * 문제: 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하세요.
 *
 * 입력:
 *   - 첫째 줄: 영어 소문자와 대문자로만 이루어진 단어 S (길이 ≤ 1000)
 *   - 둘째 줄: 정수 i (1 ≤ i ≤ |S|)
 *
 * 출력:
 *   - S의 i번째 글자 출력
 */
public class P27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();

        System.out.println(str.charAt(num-1));
    }
}
