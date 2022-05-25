package HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Main02 {
    public String solution(String str1,String str2){
        String answer = "YES";
        HashMap<Character,Integer> map = new HashMap<>();
        for (char x : str1.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (char x : str2.toCharArray()){
            if (!map.containsKey(x)||map.get(x)==0) return "NO";
            map.put(x,map.get(x)-1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(T.solution(str1,str2));
    }
}
