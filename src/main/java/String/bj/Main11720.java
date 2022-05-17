package String.bj;

import java.util.Scanner;

public class Main11720 {
    public int solution(int num, String str){
        int answer = 0;
        for (int i=0;i<num;i++){
            char change = str.charAt(i);
            answer+= Integer.parseInt(String.valueOf(change));
        }
        return answer;
    }

    public static void main(String[] args) {
        Main11720 T = new Main11720();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(num,str));
    }
}
