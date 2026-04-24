package baekjoon.step03;

import java.util.Scanner;

/**
 * 백준 10952번 - A+B - 5
 * 난이도: 브론즈 2
 * 문제: A+B를 반복해서 출력하되, A와 B가 모두 0이면 종료하세요.
 *
 * 입력:
 *   - 여러 줄에 걸쳐 A B가 주어짐 (0 < A, B < 10)
 *   - 마지막 줄에 0 0 이 주어짐
 *
 * 출력:
 *   - 각 줄마다 A+B 출력 (0 0 은 출력하지 않음)
 */
public class P10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A == 0 && B == 0) break;
            System.out.println(A + B);
        }
    }
}