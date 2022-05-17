package Array;

import java.util.Scanner;

public class Main07 {
    public int solution(int num,int[] number){
        int answer=0, cnt=0;
        for (int i=0;i<num;i++){
            if(number[i]==1){
                cnt++;
                answer+=cnt;
            }
            else cnt=0;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main07 T = new Main07();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] number = new int[num];
        for (int i=0;i<num;i++){
            number[i]=sc.nextInt();
        }
        System.out.println(T.solution(num,number));
    }
}
