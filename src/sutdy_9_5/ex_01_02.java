package sutdy_9_5;

import java.io.*;
import java.util.*;

public class ex_01_02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

        int[][] arr = new int[N][5];


        for(int i=0; i<N; i++) {

            List<Integer> setlist = new ArrayList<>();
            map.put(i,setlist);

            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<5; i++) {
            for(int j=0; j<N; j++) {
                int tmp = arr[j][i];
                List<Integer> setlist = map.get(j);
                for(int k=0; k<N; k++) {
                    if(j!=k && tmp == arr[k][i]) {
                        if(!setlist.contains(k)) {
                            setlist.add(k);
                        }
                    }
                }
                map.put(j,setlist);
            }
        }

    }
}