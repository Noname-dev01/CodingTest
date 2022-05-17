package Array;

import java.util.Scanner;

public class Main09 {
    public int solution(int num, int[][] number){
        int answer=Integer.MIN_VALUE;
        int sum1,sum2;
        for (int i=0;i<num;i++){
            sum1=sum2=0;
            for (int j=0;j<num;j++){
            sum1+=number[i][j];
            sum2+=number[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for (int i=0;i<num;i++){
            sum1+=number[i][i];
            sum2+=number[i][num-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer,sum2);
        return answer;
    }

    public static void main(String[] args) {
        Main09 T = new Main09();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] number = new int[num][num];
        for (int i=0;i<num;i++){
            for (int j=0;j<num;j++){
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println(T.solution(num,number));
    }
}
