package Programmers.Hash;

import java.util.Arrays;
import java.util.HashMap;

public class Main01 {
    public String solution(String[] participant, String[] completion){
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        for (int i=0; i< participant.length; i++) {
            map.put(participant[i],map.getOrDefault(participant[i],0)+1);
        }
        for (int i=0; i< completion.length; i++){
            map.put(completion[i],map.get(completion[i])-1);
        }
        for (String s : map.keySet()) {
            if (map.get(s)==1) answer=s;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main01 T = new Main01();
        String[] part = {"mislav","stanko","mislav","ana"};
        String[] comp = {"stanko","ana","mislav"};
        System.out.print(T.solution(part,comp));
    }
}
