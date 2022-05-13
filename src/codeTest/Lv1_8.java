package codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Lv1_8 {
    public int solution(int[] nums) {
        int answer = 0;

        // 가져갈 수 있는 개수
        int getCnt = nums.length / 2;

        // nums 중복 제거
        ArrayList<Integer> intList = (ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList());
        HashSet<Integer> hsNums = new HashSet<>(intList);

        // getCnt > nums = result = nums 길이
        if(getCnt > hsNums.size()) answer = hsNums.size();
        // getCnt < nums = result = getCnt
        else if (getCnt < hsNums.size()) answer = getCnt;
        // getCnt = nums = result = nums 길이
        else answer = hsNums.size();

        return answer;
    }


    // TEST
    public static void main(String[] args) {
        // [3,3,3,3,2,1,4,5]
        int[] ans = new int[]{3,3,3,2,2,2};
        Lv1_8 sp = new Lv1_8();
        int iRet = sp.solution(ans);
        System.out.println(iRet);
    }
}