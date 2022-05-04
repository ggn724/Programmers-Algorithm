package codeTest;
/**
 * [Lv1] 내적
 * [내용] ...
 */

public class Lv1_5 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i <a.length; i++){
            answer += (a[i]*b[i]);
        }
        return answer;
    }


    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4};
        int[] b = new int[]{-3,-1,0,2};

        Lv1_5 s = new Lv1_5();
        int iRet = s.solution(a,b);
        System.out.println(iRet);
    }
}
