package codeTest;

public class Lv1_9 {
    public int solution(int left, int right) {
        int answer = 0;
        // 범위
        for(int i = left; i <= right; i++){
            if(funcCount(i)) answer += i;
            else answer -=i;
        }
        return answer;
    }

    public boolean funcCount(int a){
        int cnt = 0;
        for(int i=1; i<=a; i++){
            if(a % i == 0) cnt++;
        }
        boolean iRet = (cnt % 2 == 0) ? true : false;
        return  iRet;
    }


    // TEST
    public static void main(String[] args){
        Lv1_9 sp = new Lv1_9();
        int iRet = sp.solution(24,27);
        System.out.println(iRet);
    }
}
