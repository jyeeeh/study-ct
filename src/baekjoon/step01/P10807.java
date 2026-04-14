package baekjoon.step01;

import java.util.Scanner;

/**
 * 백준 10807번 - 개수 세기
 * 난이도: 브론즈 5
 * 문제: N개의 정수가 주어졌을 때, 그 중 v가 몇 개인지 구하세요.
 *
 * 입력:
 *   - 첫째 줄: 정수의 개수 N (1 ≤ N ≤ 100)
 *   - 둘째 줄: N개의 정수 (-100 ≤ 각 정수 ≤ 100)
 *   - 셋째 줄: 찾으려는 정수 v (-100 ≤ v ≤ 100)
 *
 * 출력:
 *   - v의 개수를 출력
 */
public class P10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputN = sc.nextInt();
        int[] arr = new int[inputN];

        for(int i=0; i<inputN; i++){
            arr[i] = sc.nextInt();
        }

        int inputV = sc.nextInt();

        int count = 0;

        for(int i=0;i<inputN;i++){
            if(arr[i]==inputV) count++;
        }

        System.out.println(count);
    }
}
