package study_9_3;

import java.io.*;
import java.util.*;

//2023-09-13(백준 2003번_실버5) -> 수들의 합
public class ex_02 {

    public static void main(String[] arg) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //N개로된 수열
        int M = Integer.parseInt(st.nextToken()); //연속된수의 합(문제에서 요구하는 조건)

        List<Integer> list = new ArrayList<>(); //N개로된 수열의 값을 입력

        st = new StringTokenizer(br.readLine());

        //N개의 수를 차례로 담는다.
        for(int i=0; i<N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }


        int cnt = 0; //연속된 수의 합이 M일때 개수(누적되서 증가시킴)

        int start = 0; //연속된 수의 합의 첫번째 자리 위치
        int end = 0; //연속된 수의 합의 마지막 자리 위치

        int sum = 0; //연속된 수의 합

        while(true) {

            if(sum<=M) { //수들의 합이 문제에 조건모다 같거나 작을 경우
                cnt += sum == M ? 1 : 0; // 같으면 cnt를 +1
                if(end==N) {break;} //
                sum += list.get(end++); //다음 연속된 수의 합을 더해준다.
            }
            else {
                sum -= list.get(start);
                start++;
            }

        }

        System.out.println(cnt);


    }
}
