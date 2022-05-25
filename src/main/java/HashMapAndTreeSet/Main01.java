package HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Main01 {
    public char solution(int n, String vote){
        char answer = ' ';
        int max=Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x: vote.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        //key값이 존재하는지 확일할때 containsKey() 사용하면 된다 (true,false)
        //System.out.println(map.containsKey('F'));
        //key의 종류 개수를 알고싶으면 size() 사용하면 된다.
        //System.out.println(map.size());
        //특정 키를 삭제하고 싶으면 remove() 사용하면 된다.
        //System.out.println(map.remove('A'));
        for (char key : map.keySet()){
            if (map.get(key)>max){
                max=map.get(key);
                answer=key;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main01 T = new Main01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String vote = sc.next();
        System.out.print(T.solution(n,vote));
    }
}
