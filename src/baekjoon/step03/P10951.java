package baekjoon.step03;

import java.util.Scanner;

/**
 * 백준 10951번 - A+B - 4
 * 난이도: 브론즈 2
 * 문제: EOF까지 A+B를 반복해서 출력하세요.
 *
 * 입력:
 *   - 여러 줄에 걸쳐 A B가 주어짐 (0 < A, B < 10)
 *   - 입력의 끝은 EOF
 *
 * 출력:
 *   - 각 줄마다 A+B 출력
 */
public class P10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
    }
}