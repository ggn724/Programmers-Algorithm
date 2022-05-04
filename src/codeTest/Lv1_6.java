package codeTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lv1_6 {
    public String solution(String[] participant, String[] completion) {
        List<String> lsPat =  Arrays.asList(participant);
        List<String> lsComp = Arrays.asList(completion);

        List<String> resultList = lsPat.stream().filter( person-> lsComp.stream().noneMatch(Predicate.isEqual(person))).collect(Collectors.toList());
        String answer = resultList.stream().map(n->String.valueOf(n)).collect(Collectors.joining());

        return answer;
    }








    public static void main(String[] args){
        String[] x = new String[]{"kim", "stanko", "mislav", "ana"};
        String[] y = new String[]{"stanko", "ana", "mislav"};
        Lv1_6 s = new Lv1_6();
        String aa = s.solution(x,y);
        System.out.println(aa);
    }
}
