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

        1. 배열을 이용해서 해결

         */
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


        /*

        2. 리스트를 이용해서 해결

         */
        // 최대값 구하기
        int max_ = 0;
        for(int a : arr) if(a > max_) max_ = a;

        // 리스트 만들기
        List<Integer> list_ = new LinkedList<>();

        // 배열에 인덱스 채우기
        int indexL = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max_) {
                list_.add(i);
            }
        }

        // 리스트를 배열로 변환
        // 1
        int[] answer__ = list_.stream().mapToInt(Integer::intValue).toArray();
        // 2
        int[] answer_ = new int[list_.size()];
        for(int i = 0; i< list_.size(); i++){
            answer_[i] = list_.get(i);
        }


        /*

        3. 스트림을 이용해서 해결

         */
        int max__ = Arrays.stream(arr).max().getAsInt();    // 배열에 최대값 구하기
        return IntStream.range(0, arr.length)
                .filter(i -> arr[i] == max__)
                .toArray();

        // return answer_;
    }
}
