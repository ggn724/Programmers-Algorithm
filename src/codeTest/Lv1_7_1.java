package codeTest;

import java.util.Arrays;

public class Lv1_7_1 {
    public int[] solution(int[] answers) {

        // 수포자 방식 SET
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{2,1,2,3,2,4,2,5};
        int[] c = new int[]{3,3,1,1,2,2,4,4,5,5};

        // 수포자들 점수넣을 배열 SET
        int[] score = new int[3];

        // 수포자들 점수 SET
        for(int i=0; i<answers.length; i++){
            if(answers[i] == a[i%5])  score[0]++;
            if(answers[i] == b[i%8])  score[1]++;
            if(answers[i] == a[i%10]) score[2]++;
        }

        // 가장 높은 점수 찾기
        int max = 0;
        for(int i=0; i<3; i++){
            if(score[i] > max) max = score[i];
        }

        // 가장 높은 점수를 받은 사람 수
        int maxCnt = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max) maxCnt++;
        }

        // 정답 SET
        int[] answer = new int[maxCnt];
        int idx = 0;
        for(int i=0; i < 3; i++){
            if(score[i] == max) answer[idx++] = i+1;
        }
        return answer;
    }










    // TEST
    public static void main(String[] args) {
        Lv1_7_1 s7 = new Lv1_7_1();
        int[] tmp = new int[]{1,3,2,4,2};
        int[] iRet =  s7.solution(tmp);
        System.out.println(Arrays.toString(iRet));
    }
}
