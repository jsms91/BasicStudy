package study_9_4;

import java.io.*;
import java.util.*;

//2023.09.20 ACM 호텔(백준 10350번_브론즈3)
public class ex_01 {
    public static void main(String[] args)  throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i <T ; i++) {

            st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            sb.append(floor(H,W,N)).append("\n"); // 줄 바꿈 추가

        }

        System.out.println(sb.toString());

    }

    //1번째 방식(String를 사용해서 풀기)  --> 시간은 2번째 장식이 조금 더 빠름
    public static String floor(int H, int W, int N) {

        int x = 0;
        int y = 0;

        x = N%H == 0 ? H : N%H; // 층
        y =  N%H == 0 ? N/H : N/H+ 1; // 해당층에서 엘베에서부터 몇번째인지

        return (x + String.format("%02d", y));
    }
    //2번째 방식(오직 숫자로만 String 안쓰고)
    public static String floor1(int H, int W, int N) {

        int result = 0; //기본적인 구조는  높이(층) + 해당층에 몇번재 호실

        if(N%H == 0) { //나머지가 0일때는 맨 꼭대기층이고 몫이 해당층에 호실의 위치
            result = (H * 100) + N/H;
        }
        else { //나머지가 0이 아닐때 나머지가 해당 층, 몫+1이 해당층에 몇번째 호실에 위치
            result =  (N%H)*100 + (N/H+1);
        }

        return String.valueOf(result);
    }
}