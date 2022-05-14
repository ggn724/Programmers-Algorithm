/**
 * 예산
 * */

package CodingTest.Level1.예산;

import java.util.Arrays;

public class Lv1_10 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        // 배열 Sort
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));

        // while 돌리면서 값빼주고 cnt하기
        for (int i = 0; 0 < budget; i++) {
            if (budget >= d[i]) {
                budget -= d[i];
                answer++;
            } else break;
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] a = new int[]{1,3,2,5,4};
        Lv1_10 sp = new Lv1_10();
        int iRet = sp.solution(a, 9);
        System.out.println(iRet);
    }
}
