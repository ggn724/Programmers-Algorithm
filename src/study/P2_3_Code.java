package study;

import java.util.LinkedList;
import java.util.*;
import java.util.stream.Stream;

public class P2_3_Code {

    public int[] solution(long n) {

        // 배열 길이 구해서 배열 정의하기
        int len =  (int)(Math.log10(n)+1);
        int[] iRet = new int[len];

        // 자연수 n 자리수마다 배열에 넣어주기
        int[] numSort = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();

        // 배열 뒤집기
        for(int i=0; i < numSort.length; i++){
            iRet[(len-1)-i] = numSort[i];
        }
        return iRet;
    }

    public static void main(String[] args){
        P2_3_Code p2 = new P2_3_Code();
        int[] s = p2.solution(12345);
        System.out.println(Arrays.toString(s));
    }
}
