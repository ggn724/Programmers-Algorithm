package CodingTest.Level1.체육복;

public class Lv1_17 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        // lost 인원 reserve 인원 비교
        int notPerson = 0;
        for (int los : lost) {
            for (int res : reserve) {
                if (notPerson == res) continue;
                if ((los - 1) == res || (los + 1) == res) {
                    answer++;
                    notPerson = res;
                    break;
                }
            }
        }
        return answer;
    }


    // Test
    public static void main(String[] args) {
        Lv1_17 sp = new Lv1_17();
        int n = 3;
        int[] lost = new int[]{3};
        int[] reserve = new int[]{1};
        sp.solution(n, lost, reserve);
    }
}
