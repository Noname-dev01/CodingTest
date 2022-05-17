package String.bj;

import java.util.Scanner;

public class Main07 {
    public String solution(String str){
        String answer="YES";
        int length = str.toUpperCase().length();
        for (int i=0;i<length/2;i++){
            if(str.charAt(i)!=str.charAt(length-i-1)){
                answer="No";
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main07 T = new Main07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
