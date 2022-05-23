package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class Main03 {
    public int solution(int n,int k,int[] money){
        int answer, sum = 0;
        for (int i=0; i<k; i++) sum+=money[i];
        answer=sum;
        for (int i=k; i<n; i++){
            sum+=(money[i]-money[i-k]);
            answer=Math.max(answer,sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] money = new int[n];
        for (int i=0; i<n; i++){
            money[i] = sc.nextInt();
        }
        System.out.print(T.solution(n,k,money));
    }
}
