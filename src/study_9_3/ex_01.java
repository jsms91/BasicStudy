package study_9_3;

import java.io.*;
import java.util.StringTokenizer;

//2023-09-13(백준 2506_브론즈3) -> 점수 계산
public class ex_01 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] score = new int[N];

        int sum = 0; //누적되는 점수의 합(정답)
        int check = 1;//이전문제가 정답인지 아닌지 체크해서 더해줄 점수를 설정

        //정답을 담으면서 이전의 값이 정답인지 체크 + 점수 계산
        for(int i=0; i<N; i++) {

            score[i] = Integer.parseInt(st.nextToken());

            if(score[i] == 1) { //현재 입력한 값이 정답이면 여기서 실행
                sum += check; //check에 입력된 점수를 누적되는 점수의 합에 더하기
                check++; //정답일 경우 점수를 누적시킨다.
            }
            else { //정답이 아닐 경우
                check = 1; //다음의 정답은 무조건 1점을 더해야해서 1로 초기화
            }

        }

        System.out.println(sum);

    }
}