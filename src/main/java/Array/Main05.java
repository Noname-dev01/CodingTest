package Array;

import java.util.Scanner;

public class Main05 {
    public int solution(int num){
        int answer = 0;
        int[] ch = new int[num+1];
        for (int i=2;i<=num;i++){
            if (ch[i]==0) {
                answer++;
                for (int j = i; j <= num; j = j + i) ch[j] = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main05 T = new Main05();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(T.solution(num));
    }
}
