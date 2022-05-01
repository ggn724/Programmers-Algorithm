package study;

/*
[실습]2-1. 최대값 인덱스 구하기
1. 배열 방식
2. 리스트 방식
3. 스트림 방식
 */
import java.util.*;
import java.util.stream.IntStream;

public class P2_Code_MaxIndex {
    public static void main(String[] args){

    }

    public static int[] solution(int[] arr) {
        /*
         * 1. 배열 이용
         **/

        // 최대값 구하기
        int max = 0;
        for(int a : arr) if(a > max) max = a;

        // 최대값이 몇개인지 확인하기
        int count = 0;
        for(int a : arr) if(a == max) count++;

        // 배열 만들기
        int[] answer = new int[count];

        // 배열에 인덱스 채우기
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                answer[index++] = i;
            }
        }
        //===========================================================
        /*
         * 2. 리스트를 이용해서 해결
         */

        // 최대값 구하기
        int max2 = 0;
        for(int a : arr) if(a > max2) max2 = a;

        // 리스트 만들기
        List<Integer> list = new LinkedList<>();

        // 배열에 인덱스 채우기
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max2) {
                list.add(i);
            }
        }

        // 리스트를 배열로 변환
        // 첫번째 방법
        int[] answer1 = list.stream().mapToInt(Integer::intValue).toArray(); // list를 배열로 변환 하는 방법
        // 두번째 방법
        int[] answer2 = new int[list.size()];
        for(int i = 0; i< list.size(); i++){
            answer2[i] = list.get(i);
        }

        //===========================================================
        /*
         * 3. 스트림을 이용해서 해결
         */
        
        int max3 = Arrays.stream(arr).max().getAsInt();    // 배열에 최대값 구하기
        return IntStream.range(0, arr.length)
                .filter(i -> arr[i] == max3)
                .toArray();

        // return answer_;
    }
}