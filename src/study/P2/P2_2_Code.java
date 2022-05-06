package study.P2;

/*
* [실습] 2-2 순열검사
* [내용] 1.배열에 중복 체크 > 2.배열 내 길이만큼 차례대로 들어갔는지 체크
* [출처] 프로그래머스
* */

import java.util.Arrays;

public class P2_2_Code {
	public boolean solution(int[] arr) {
		Arrays.sort(arr, 0, arr.length);
		// 1. 배열에 중복 이 있는지 확인
		// 2. 배열 내 길이만큼 값이 차례대로 들어갔는지 확인
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1)
				return false;
		}
		return true;


		//////////////////////////////////////////////////////
		/*
		* 해설
		* */

		// 1. 정답을 만들어 놓고
		// 2. 문제 배열을 sort 시키고
		// 3. 배열을 비교
		/*
		int[]  answer = new int[arr.length];
		for(int i=0; i< arr.length; i++) answer[i] = i+1; 		// O(n)

		Arrays.sort(arr);										// O(nlogn)

		return Arrays.equals(answer, arr);						// O(n)
																//========> 총 O(2*n +nlogn)  =====> O(nlogn)
		*/
		//////////////////////////////////////////////////////
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 1, 3 ,2};
		P2_2_Code p2 = new P2_2_Code();
		boolean bVal = p2.solution(arr);
		System.out.println(bVal);
	}
}
