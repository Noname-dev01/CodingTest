package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main02 {
    public int solution(int n, int[] arr){
        int answer = 1;
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]) {
                answer++;
                max=arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(T.solution(num,arr));
    }
}
