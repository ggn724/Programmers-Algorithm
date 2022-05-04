package codeTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lv1_6 {
    public String solution(String[] participant, String[] completion) {

        /* 나의 잘못된 1차 풀이*/
/*
        List<String> lsPat =  Arrays.asList(participant);
        List<String> lsComp = Arrays.asList(completion);

        List<String> resultList = lsPat.stream().filter( person-> lsComp.stream().noneMatch(Predicate.isEqual(person))).collect(Collectors.toList());
        String answer = resultList.stream().map(n->String.valueOf(n)).collect(Collectors.joining());
*/

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


    public static void main(String[] args) {
        String[] x = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] y = new String[]{"stanko", "ana", "mislav"};
        Lv1_6 s = new Lv1_6();
        String aa = s.solution(x, y);
        System.out.println(aa);
    }
}
