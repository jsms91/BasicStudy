package study_9_4;

import java.util.*;

//2023.09.20 석호님 기업 코딩테스트 보신 문제
public class ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        int start = 2;

        for(int i=1; i<n; i++) {
            int num = (n-i)*(n-i); //기본 정사각형의 제곱 -> 가장 작은 단위의 정사각형의 개수(예를 들어 1*1, 2*2, 3*3, 4*4의 정사각형의 개수
            result += i==1 ? num : num*(start-1); //처음 1일 경우에는 대각선 정사각형이 없고 이후 길이가 2이상일 경우부터는 양똑 점을 제외하고 가운데 점의 개수가 대각선 정사각형의 개수이다.
            start++;//정사각형의 단위 증가(1*1 -> 2*2 -> 3*3 여기서는 점이 2개있대 길이가 1로 생각해서 문제 풀어서 점이 2개일 경우가 초기값으로 1씩 증가한다.
        }
        System.out.println(result);
    }
}
/*
if(i>1) {
    result += num * (start-1);
}
else (i==1) {
    result = num;
}
start++;
*/