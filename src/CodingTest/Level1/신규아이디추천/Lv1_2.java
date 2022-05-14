/**
 * [Lv1] 신규 아이디 추천
 * */

package CodingTest.Level1.신규아이디추천;

public class Lv1_2 {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();

        // 2단계
        new_id = new_id.replaceAll("[^a-z0-9-_.]","");

        // 3단계
        new_id = new_id.replaceAll("[.]{2,}",".");

        // 4단계
        new_id = new_id.replaceAll("^[.]|[.]$","");

        // 5단계
        if(new_id.equals("")){
            new_id += "a";
        }

        // 6단계
        if(new_id.length() >= 16){
            new_id = new_id.substring(0,15);
            new_id = new_id.replaceAll("[.]$","");
        }

        // 7단계
        if(new_id.length() <= 2){
            String lastStr = new_id.substring(new_id.length()-1,new_id.length());
            while(new_id.length() < 3){
                new_id += lastStr;
            }
        }
        return new_id;
    }

    // Test
    public static void main(String[] args) {
        String a = "...!@BaT#*..y.abcdefghijklm";
        Lv1_2 lv1_2 = new Lv1_2();
        String iRet = lv1_2.solution(a);
        System.out.println(iRet);
    }
}
