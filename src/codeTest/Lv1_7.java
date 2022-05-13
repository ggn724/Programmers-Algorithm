package codeTest;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class Lv1_7 {
    public int[] solution(int[] answers) {
        // 정답 맞힌 횟수
        int getCntP1 = 0;
        int getCntP2 = 0;
        int getCntP3 = 0;

        // 수포자 값 SET
        int[] P1 = new int[]{1,2,3,4,5};
        int[] P2 = new int[]{2,1,2,3,2,4,2,5};
        int[] P3 = new int[]{3,3,1,1,2,2,4,4,5,5};

        // 핵심!!
        for(int i=0; i < answers.length; i++) {
            if(answers[i] == P1[i%5]) getCntP1++;
            if(answers[i] == P2[i%8]) getCntP2++;
            if(answers[i] == P3[i%10]) getCntP3++;
        }

        int result = tmpfunc(getCntP1,getCntP2,getCntP3);
        int[] answer = Stream.of(String.valueOf(result).split("")).mapToInt(Integer::parseInt).toArray();
        return answer;
    }

    int tmpfunc(int a, int b, int c){
        String iRet = "";
        int result = 0;

        if(a == b) {
            if(a == c) iRet = "abc";
            else iRet = (a > c) ? "ab":"c";
        } else if(a > b) {
            if(a == c) iRet = "ac";
            else iRet = (a > c) ? "a":"c";
        } else {
            if(b == c) iRet = "bc";
            else iRet = (b > c) ? "b":"c";
        }

        switch(iRet){
            case "abc":
                result = 123;
                break;
            case "ab":
                result = 12;
                break;
            case "ac":
                result = 13;
                break;
            case "bc":
                result = 23;
                break;
            case "a":
                result = 1;
                break;
            case "b":
                result = 2;
                break;
            case "c":
                result = 3;
                break;
        }
        return result;
    }



    public static void main(String[] args) {
        int[] tmp = new int[]{1,3,2,4,2};
        Lv1_7 s7 = new Lv1_7();
        int[] iRet =  s7.solution(tmp);
        System.out.println(Arrays.toString(iRet));
    }
}
