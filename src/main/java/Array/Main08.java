package Array;

import java.util.Scanner;

public class Main08 {
    public int[] solution(int num,int[] score){
        int[] answer = new int[num];
        for (int i=0;i<num;i++){
           int cnt=1;
          for (int j=0;j<num;j++){
              if (score[i]<score[j]){
                  cnt++;
              }
              answer[i]=cnt;
          }
            }
        return answer;
    }
    public static void main(String[] args) {
        Main08 T = new Main08();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] score = new int[num];
        for (int i=0;i<num;i++){
            score[i]=sc.nextInt();
        }
        for (int x : T.solution(num,score)){
            System.out.print(x+" ");
        }
    }
}
