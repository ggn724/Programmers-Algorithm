import java.util.*;
/*
* 신고 결과 받기
* */
public class Lv1_1 {
    public static void main(String[] args) {


    }

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // Map 정의 및 초기화
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();

        // Map 초기화
        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);
        }

        // 신고 기록
        for (String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            map.get(to).add(from);
        }

        // 이용정지 메일 발송
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[idxMap.get(name)]++;
                }
            }
        }
        return answer;
    }
}
