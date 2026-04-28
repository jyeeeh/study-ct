package baekjoon.step03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * 백준 11022번 - A+B - 8
 * 난이도: 브론즈 1
 * 문제: T개의 테스트 케이스에 대해 "Case #x: A + B = C" 형식으로 출력하세요.
 *
 * 입력:
 *   - 첫째 줄: T (1 ≤ T ≤ 1,000,000)
 *   - 다음 T줄: A B (1 ≤ A, B ≤ 1,000)
 *
 * 출력:
 *   - Case #1: 1 + 2 = 3
 *   - Case #2: 3 + 4 = 7
 *   - ...
 */
public class P11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i+1).append(": ")
              .append(A).append(" + ").append(B)
              .append(" = ").append(A+B).append("\n");
        }
        System.out.print(sb);
    }
}