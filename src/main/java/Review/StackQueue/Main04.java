package Review.StackQueue;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class Main04 {
    public int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int x : str.toCharArray()) {
            if (Character.isDigit(x)){
                stack.push(x-'0');
            }else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt+rt);
                else if (x == '-') stack.push(lt-rt);
                else if (x == '*') stack.push(lt*rt);
                else if (x == '/') stack.push(lt/rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
