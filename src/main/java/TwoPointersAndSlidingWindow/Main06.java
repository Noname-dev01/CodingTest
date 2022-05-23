package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class Main06 {
    public int solution(int n){
        int answer = 0, cnt=1;
        n--;
        while (n>0){
            cnt++;
            n=n-cnt;
            if (n%cnt==0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main06 T = new Main06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(T.solution(n));
    }
}
