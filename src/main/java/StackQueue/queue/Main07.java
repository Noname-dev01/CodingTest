package StackQueue.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main07 {
    public String solution(String mustClass,String planClass){
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char x : mustClass.toCharArray()) queue.offer(x);
        for (char x : planClass.toCharArray()){
            if (queue.contains(x)){
                if (x!=queue.poll()) return "NO";
            }
        }
        if (!queue.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Main07 T = new Main07();
        Scanner sc = new Scanner(System.in);
        String mustClass = sc.next();
        String planClass = sc.next();
        System.out.println(T.solution(mustClass,planClass));
    }
}
