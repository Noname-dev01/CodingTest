package Review.String;

import java.util.ArrayList;
import java.util.Scanner;

public class Main04 {
    public ArrayList<String> solution(int n, String[] arr){
        ArrayList<String> answer = new ArrayList<>();
        String a = "";
        for (int j=0; j<n;j++) {
            for (int i=0; i<arr[j].length(); i++) {
                int len = arr[j].length();
                a+=arr[j].charAt(len-1);
                --len;
            }
            answer.add(a);
            a="";
        }

        return answer;
    }
    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i=0; i<arr.length; i++) {
            arr[i]=sc.next();
        }
        for (String s : T.solution(n,arr)) {
            System.out.println(s);
        }
    }
}
