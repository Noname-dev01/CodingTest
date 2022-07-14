package Programmers.StackQueue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class NoSameNumber {
    public ArrayList<Integer> solution (int []arr){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) stack.push(arr[i]);
            else if (stack.peek()==arr[i]) {
                stack.pop();
                stack.push(arr[i]);
            }
            else stack.push(arr[i]);
        }

        return new ArrayList<>(stack);
    }

    public static void main(String[] args) {
        NoSameNumber T = new NoSameNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
