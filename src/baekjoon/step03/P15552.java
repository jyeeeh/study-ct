package baekjoon.step03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * 백준 15552번 - 빠른 A+B
 * 난이도: 실버 5
 * 문제: T개의 테스트 케이스에 대해 A+B를 출력하세요.
 *
 * 입력:
 *   - 첫째 줄: T (1 ≤ T ≤ 1,000,000)
 *   - 다음 T줄: A B (1 ≤ A, B ≤ 1,000)
 *
 * 출력:
 *   - 각 줄마다 A+B 출력
 */
public class P15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 문자열 읽고 정수 변환
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i < T; i++){
            // 한 줄로 읽어서 공백 기준 분리
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            // 결과 sb에 누적
            sb.append(A + B).append("\n");
        }
        System.out.print(sb);
    }
}