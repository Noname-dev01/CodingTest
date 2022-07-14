package Review.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main01 {
    public String solution(String str){
        String answer = "NO";
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == '(') {
                stack.push(chars[i]);
            }
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (stack.isEmpty()) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Main01 T = new Main01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
