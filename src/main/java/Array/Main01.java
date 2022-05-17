package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main01 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i=1;i<n;i++){
            if (arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main01 T = new Main01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for (int x : T.solution(num,arr)){
            System.out.print(x+" ");
        }

    }
}
