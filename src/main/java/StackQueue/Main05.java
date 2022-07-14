package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main05 {
    public int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') stack.push((int) chars[i]);
            else if (chars[i] == ')'){
                if (chars[i-1] == '('){
                    stack.pop();
                    answer+=stack.size();
                }else {
                    stack.pop();
                    answer += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main05 T = new Main05();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
