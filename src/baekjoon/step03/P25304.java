package baekjoon.step03;

import java.util.Scanner;

/**
 * 백준 25304번 - 영수증
 * 난이도: 브론즈 3
 * 문제: 총 금액과 N개의 물건 (가격, 개수)를 입력받아 영수증이 맞는지 확인하세요.
 *
 * 입력:
 *   - 첫째 줄: 총 금액 X
 *   - 둘째 줄: 물건 종류 수 N
 *   - 다음 N줄: 물건 가격 a, 개수 b
 *
 * 출력:
 *   - 합계가 X와 같으면 Yes, 다르면 No
 */
public class P25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long totalX = sc.nextLong();
        int itemCount = sc.nextInt();
        long sum = 0;

        for(int i =0; i< itemCount; i++){
            int itemPriceA = sc.nextInt();
            int itemQuantity = sc.nextInt();
            sum += (long) itemPriceA * itemQuantity;
        }

        if(totalX == sum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}