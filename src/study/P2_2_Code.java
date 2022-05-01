package study;

import java.util.Arrays;

public class P2_2_Code {
    public boolean solution(int[] arr){
        // 배열 정렬
        Arrays.sort(arr,0,arr.length);
        //1. 배열에 중복 이 있는지 확인
        for(int i =0; i < arr.length; i++){
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]) return false;
            }
            //2. 배열 내 길이만큼 값이 차례대로 들어갔는지 확인
            if(arr[i] != i+1) return false;
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = new int[]{4,1,3};
        P2_2_Code p2 = new P2_2_Code();
        boolean bVal = p2.solution(arr);
        System.out.println(bVal);
    }
}
