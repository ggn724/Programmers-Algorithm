/**
 * [Lv1] 3진법 뒤집기
 * */

package CodingTest.Level1.뒤집기3진법;

import java.util.*;
import java.util.stream.Collectors;

public class Lv1_19 {
    public int solution(int n) {
        // 10진수 -> 3진수 변환
        String n3 = Integer.toString(n,3);

        // ArrayList로 변환
        String[] strArr = n3.split("");
        ArrayList<String> n3List = new ArrayList<String>(Arrays.asList(strArr));

        // 뒤집기
        Collections.reverse(n3List);

        // ArrayList -> String 변환
        String iRet = String.join("",n3List);

        // 3진수 -> 10진수 변환
        int answer = Integer.parseInt(iRet,3);
        return answer;
    }

    // Test
    public static void main(String[] args){
        Lv1_19 sp = new Lv1_19();
        int iRet = sp.solution(45);
        System.out.println(iRet);
    }
}
