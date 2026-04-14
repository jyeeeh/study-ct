package baekjoon.step01;

import java.util.Scanner;

/**
 * 백준 2562번 - 최댓값
 * 난이도: 브론즈 5
 * 문제: 9개의 서로 다른 자연수가 주어질 때, 최댓값과 그 위치를 구하세요.
 *
 * 입력:
 *   - 9줄에 걸쳐 자연수가 하나씩 주어짐 (1 ≤ 자연수 ≤ 100)
 *
 * 출력:
 *   - 첫째 줄: 최댓값
 *   - 둘째 줄: 최댓값의 위치 (몇 번째 수인지)
 */
public class P2562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int maxIndex = 0;

        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]) {
                max = arr[i];
                maxIndex = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
    }
}
