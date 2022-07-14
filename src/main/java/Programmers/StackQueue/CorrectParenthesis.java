package Programmers.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParenthesis {
    public boolean solution(String s){
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (char x: s.toCharArray()) {
            if (x == '(') stack.push(x);
            else if (x == ')'){
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return false;

        return answer;
    }

    public static void main(String[] args) {
        CorrectParenthesis T = new CorrectParenthesis();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}
