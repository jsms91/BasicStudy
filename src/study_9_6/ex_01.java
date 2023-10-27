package study_9_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//2023.10.11 뒤집기(백준 1439번_실버5)
public class ex_01 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split("");

        List<Integer> list = new ArrayList<>();

        int x = 0; //0의 값
        int y = 0; //1이 값

        for(int i=0; i<str.length; i++) {
            if(list.size()==0) {
                list.add(Integer.parseInt(str[i]));
            }
            else {
                if(list.get(list.size()-1) != Integer.parseInt(str[i])) {
                    list.add(Integer.parseInt(str[i]));
                }
            }
        }

        for(int check : list) {
            if(check ==0 ) {
                x++;
            }
            else {
                y++;
            }
        }

        System.out.println(Math.min(x,y));

    }
}
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        map.put(0,0);
//        map.put(1,0);
// -> 이렇게도 풀어보기
