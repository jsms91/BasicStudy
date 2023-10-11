package study_9_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//2023.10.11 방 번호(백준 1475번_실버5)
public class ex_02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[10];

        while(n!=0) {
            arr[n%10]++;
            n=n/10;
        }

        int max = 0;

        for(int i=1; i<10; i++) {
            if(i==6) {
                int sum = arr[6]+arr[9];
                int tmp = sum/2 + sum%2;
                arr[i] = tmp;
                arr[9] = tmp;
            }
            max = Math.max(max,arr[i]);
        }

        System.out.println(max);

    }
}
/*
1. 중복되는 숫자의 세트의 수 구하기
2. 세트의 수중 제일 많은 세트의 숫자의 개수가 정답

3. 조건으로는 6,9가 존재하는 경우를 생각하기

가장 세트수가 많은 경우가 6,9의 경우

6의 개수와 9의 개수의 차이로 그 수의 경우의 수를 구하고

6,9 다음의 세트에 수의 개수와 비교해서 정답을 도출

*/