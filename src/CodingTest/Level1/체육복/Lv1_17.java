package CodingTest.Level1.체육복;

import java.util.ArrayList;
import java.util.Arrays;

public class Lv1_17 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        ArrayList<Integer> losList = new ArrayList<>();
        ArrayList<Integer> resList = new ArrayList<>();

        // 여벌을 가지고 있는 학생이 도난 당할 경우
        for(int los : lost){
            for(int res: reserve){
                if(los == res){
                    losList.add(los);
                    resList.add(res);
                }
            }
        }

        int[] resReal = resList.stream().mapToInt(Integer::intValue).toArray();
        int[] losReal = losList.stream().mapToInt(Integer::intValue).toArray();

        // lost 인원 reserve 인원 비교
        int notPerson = 0;
        for (int los : losReal) {
            for (int res : resReal) {
                if (notPerson == res) continue;
                if ((los - 1) == res || (los + 1) == res) {
                    answer++;
                    notPerson = res;
                    break;
                }
            }
        }
        return answer;
    }


    // Test
    public static void main(String[] args) {
        Lv1_17 sp = new Lv1_17();
        int n = 5;
        int[] lost = new int[]{2,3,4};
        int[] reserve = new int[]{1,3,5};
        int a = sp.solution(n, lost, reserve);
        System.out.println(a);
    }
}
