package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main03 {
    public int solution(int[][] arr, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][pos-1] != 0){
                    int doll = arr[i][pos-1];
                    arr[i][pos-1]=0;
                    if (!stack.isEmpty() && doll==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }
                    else stack.push(doll);
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <N ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int M = sc.nextInt();
        int[] moves = new int[M];
        for (int i = 0; i < M; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr,moves));
    }
}
