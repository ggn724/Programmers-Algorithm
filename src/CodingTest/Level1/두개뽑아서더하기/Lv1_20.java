/**
 * [Lv1] 두개뽑아서더하기
 */

package CodingTest.Level1.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Arrays;

public class Lv1_20 {
    public int[] solution(int[] numbers) {

        // numbers for 모든 수 더 해서 numList에 넣기
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                numList.add(numbers[i] + numbers[j]);
            }
        }

        // ArrayList -> 배열로 바꾸기(sort, distinct)
        int[] answer = numList.stream()
                .mapToInt(i -> i)
                .distinct()
                .sorted()
                .toArray();

        return answer;
    }


    // Test
    public static void main(String[] args) {
        int[] ans = new int[]{5, 0, 2, 7};
        Lv1_20 sp = new Lv1_20();
        int[] iRet = sp.solution(ans);
        System.out.println(Arrays.toString(iRet));
    }
}
