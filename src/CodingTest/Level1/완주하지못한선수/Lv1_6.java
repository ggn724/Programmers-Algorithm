/**
 * [Lv1] 완주하지 못한 선수
 * */

package CodingTest.Level1.완주하지못한선수;

import java.util.HashMap;

public class Lv1_6 {
    public String solution(String[] participant, String[] completion) {
        // HashMap 이용 (name , 0)
        String answer = "";
        HashMap<String, Integer> hMap = new HashMap<>();

        // 참여자들 SET
        for (String name : participant) {
            hMap.put(name, hMap.getOrDefault(name, 0) + 1);    // (name , 1)
        }

        // 완주자들 SET
        for (String name : completion) {
            hMap.put(name, hMap.get(name) - 1);
        }

        // hashmap 담겨있는 참가자들 value가 0이 아닌것을 찾으면 됨.
        for(String name : hMap.keySet()){
            if(hMap.get(name) != 0){
                answer = name;
            }
        }
        return answer;
    }

    // Test
    public static void main(String[] args) {
        String[] x = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] y = new String[]{"stanko", "ana", "mislav"};
        Lv1_6 s = new Lv1_6();
        String aa = s.solution(x, y);
        System.out.println(aa);
    }
}
