package codeTest;

import java.util.*;

public class Lv1_7 {

    public int[] solution(int[] answers) {
        // 수포자들 정답 횟수 count...
        List<Integer> listPerson = new ArrayList<>();
        Map<String, Integer> getCountP1 = new HashMap<>();
        Map<String, Integer> getCountP2 = new HashMap<>();
        Map<String, Integer> getCountP3 = new HashMap<>();

        // 수포자1 set
        int i = 1;
        for(int j=0; j<answers.length; j++){
                if(i > 5) i = 1;
                if(i == answers[j]){
                    getCountP1.put("p1", getCountP1.getOrDefault("p1",0)+1);
                }
                i++;
            }

        // 수포자2 set
        int i2 = 1;
        for(int j=0; j<answers.length; j++){
            if(j%2 == 0){
                if(answers[j] == i) {
                    getCountP2.put("p2", getCountP2.getOrDefault("p2", 0)+1);
                }
                i++;
                if(i == 2) i++;
                if(i > 5) i=1;
            } else if(answers[j] == 2){
                getCountP2.put("p2", getCountP2.getOrDefault("p2", 0)+1);
            }
        }
        listPerson.add(getCountP1.get("p1"));
        listPerson.add(getCountP2.get("p2"));

        int[] answer = listPerson.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }




    public static void main(String[] args) {
        int[] tmp = new int[]{1,2,3,4,5};
        Lv1_7 s7 = new Lv1_7();
        int[] iRet =  s7.solution(tmp);
        System.out.println(Arrays.toString(iRet));
    }
}
