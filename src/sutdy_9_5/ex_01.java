package sutdy_9_5;

import java.io.*;
import java.util.*;

//2023.10.04 임시 반장 정하기(백준 1268번_브론즈1)
//완전 탐색
public class ex_01 {

    static HashMap<Integer, List<Integer>>student;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); //총 학생수

        student = new HashMap<>();

        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i=1; i<=N; i++) { //문제에서 주어진 표에 값을 넣기

            List<Integer> studentlist = new ArrayList<>();
            student.put(i,studentlist); //초기값 설정

            st = new StringTokenizer(br.readLine());

            for(int j=1; j<=5; j++) {

                if(!map.containsKey(j)) {
                    int n = Integer.parseInt(st.nextToken());
                    List<Integer> list = new ArrayList<>();
                    list.add(n);
                    map.put(j,list);
                }
                else {
                    int n = Integer.parseInt(st.nextToken());
                    List<Integer> list = map.get(j);
                    list.add(n);
                    map.put(j,list);
                }

            }
        }

        for(int i=1; i<=5; i++) {
            search(i, map.get(i));
        }

        int ans = 1;
        for(int i=2; i<=N; i++) {
            ans = student.get(ans).size() >= student.get(i).size() ? ans : i ;
        }

        System.out.println(ans);
    }

    //해당 학년에 학생과 같은 학년에 같은 반인 학생이 있는지 찾기
    public static void search(int num, List<Integer> list) {

        for(int i=0; i<list.size(); i++) {

            int tmp = list.get(i); //기준이 되는 학생

            for(int j=0; j<list.size(); j++) {
                List<Integer> studentlist = student.get(i+1);
                if(i!=j && (tmp == list.get(j))) {
                    if(!studentlist.contains(j)) { //기존에 같은 반했던 친구 없는경우
                        studentlist.add(j);
                        student.put(i+1,studentlist);
                    }
                }
            }
        }


    }
}