package Programmers.Hash;

import java.util.HashMap;

public class Main03 {
    public int solution(String[][] clothes){
        int answer= 1;
        HashMap<String,Integer> map = new HashMap<>();
        for (int i=0;i< clothes.length;i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }
        for (String s : map.keySet()) {
            map.put(s, map.get(s)+1);
            int value= map.get(s);
            answer=value*answer;
        }
        answer=answer-1;

        return answer;
    }

    public static void main(String[] args) {
        Main03 T = new Main03();
        String[][] clothes = {{"yellowhat", "headgear"},
                             {"bluesunglasses","eyewear"},
                             {"green_turban","headgear"}};
        System.out.println(T.solution(clothes));
    }
}
