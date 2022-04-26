/*
* Lv1 신고 결과 받기
* */

import java.util.*;

public class Lv1_1 {
    public static void main(String[] args) {

    }

    public int[] solution(String[] id_list, String[] report, int k) {
        // key(신고 당한 유저) : value(신고 한 유저) // 중복이면 한 건으로 => hashSet()
        Map<String,HashSet<String>> reportMemberList = new HashMap<>();
        // key(유저) : value(유저가 신고결과 메일을 받을 횟수)
        Map<String,Integer> getMailCount = new HashMap<>();

        // Map 초기화
        for(String id : id_list){
            getMailCount.put(id,0); // getMailCount Map에 id와 메일횟수 0으로 초기화
            reportMemberList.put(id, new HashSet<>()); // 신고 당한 유저는 한명씩, 신고자는 여러명일 수 있지만 HashSet으로 중복 제거 초기화
        }

        // 신고 기록
        for(String rpt : report){
            String[] str = rpt.split(" ");
            String 신고자 = str[0];
            String 신고당한사람 = str[1];

            reportMemberList.get(신고당한사람).add(신고자);
        }

        // 이용정지 메일 발송
        for(String id : id_list){
            HashSet<String> reports = reportMemberList.get(id);
            if(reports.size() >= k){
                for(String reporter : reports){
                    int cnt = getMailCount.get(reporter);
                    getMailCount.put(reporter,cnt+1);
                }
            }
        }

        // answer에 return 값 셋
        int[] answer = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++){
            answer[i] = getMailCount.get(id_list[i]);
        }

        return answer;
    }
}
