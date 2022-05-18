package CodingTest.Level1.실패율;

import java.util.*;

public class Lv1_18 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int idx =0;                 // 결과 set  할때 필요한 index

        Map<Integer, Double> failMap = new HashMap<>();
        for (int n = 1; n < N + 1; n++) {
            int players = 0;            // 스테이지에 도달한 플레이어 수
            int noClear = 0;            // 아직 클리어 하지 못한 플레이어의 수

            for (int i = 0; i < stages.length; i++) {
                if (n <= stages[i]) players++;
                if (n == stages[i]) noClear++;
            }
            failMap.put(n, (double) noClear / players);
        }

        // Map의 value 값으로 정렬

        List<Integer> listKeySet = new ArrayList<>(failMap.keySet());

        Collections.sort(listKeySet,(value1,value2) -> (failMap.get(value2).compareTo(failMap.get(value1))));

        for(Integer key : listKeySet){
            answer[idx] = key;
            idx++;
        }

        return answer;
    }


    // Test
    public static void main(String[] args) {
        Lv1_18 sp = new Lv1_18();
        int[] se = new int[]{2, 1, 2, 6, 2, 4, 3, 3};
        int[] iRet = sp.solution(5, se);
        System.out.println(Arrays.toString(iRet));
    }
}
