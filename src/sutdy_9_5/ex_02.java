package sutdy_9_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//2023.10.04 석호님 기업 코딩테스트 보신 문제
public class ex_02 { // 모든 경우의 수 - 경우의 수(중복도 생각해서) ex) 1-2 ,2-3, -> 1-3도 같은 따라서 총 3개의 경우의 수
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //학생 수
        int m = Integer.parseInt(st.nextToken()); //경우의 수

        int total = (N-1)%2 ==0 ? N*(N/2) : N*(N/2) + ((N/2)+1); //총 경우의 수

        st = new StringTokenizer(br.readLine());

        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i=0; i<m; i++) {
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(!map.containsKey(x-1)) { //
                List<Integer> list = new ArrayList<>();

                if(map.containsKey(x)) {
                    list = map.get(x);
                }

                list.add(y);
                map.put(x,list);
            }



        }
        
    }
}