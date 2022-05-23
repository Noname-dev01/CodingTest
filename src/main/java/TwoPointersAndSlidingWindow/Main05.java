package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class Main05 {
    public int solution(int n){
        int answer = 0, sum=0, lt=0,check=(n/2)+1;
        int[] arr = new int[check];
        for (int i=0; i<check; i++) arr[i]=i+1;
        for (int rt=0; rt<check; rt++){
            sum+=arr[rt];
            if (sum==n) answer++;
            while (sum>=n){
                sum-=arr[lt++];
                if (sum==n) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main05 T = new Main05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(T.solution(n));
    }
}
