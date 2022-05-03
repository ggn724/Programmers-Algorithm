package codeTest;
/**
 * [Lv1] 없는 숫자 더하기
 * [내용] 배열 sort
 *       배열 합에서 있는 배열 빼주기
 *       값 셋팅
 */

import java.util.Arrays;

public class Lv1_4 {

    public int solution(int[] numbers){

        int sum =0, answer = 0;

        Arrays.sort(numbers);
        for(int i = 0; i < 10; i++){
            sum += i;
            for(int a : numbers){
                if(i == a){
                    answer += i;
                }
            }
        }

        return sum - answer;
    }



    public static void main(String[] arg){
        int[] iRet = new int[]{1,2,3,4,6,7,8,0};
        Lv1_4 tmp = new Lv1_4();
        int a = tmp.solution(iRet);
        System.out.println(a);
    }
}
