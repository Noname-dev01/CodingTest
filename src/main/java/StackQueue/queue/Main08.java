package StackQueue.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main08 {

    class Person{
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int n, int m,int[] danger){
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(new Person(i,danger[i]));
        }
        while (!queue.isEmpty()){
            Person tmp=queue.poll();
            for (Person x : queue){
                if (x.priority>tmp.priority){
                    queue.add(tmp);
                    tmp=null;
                    break;
                }
            }
            if (tmp!=null){
                answer++;
                if (tmp.id==m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main08 T = new Main08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] danger = new int[n];
        for (int i = 0; i < n; i++) {
            danger[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,danger));
    }
}
