package String;

import java.util.Scanner;

public class Main07 {
    public String solution(String str){
        String answer="YES";
//        str=str.toUpperCase();
//        int len=str.length();
//        for(int i=0; i<len/2; i++){
//            if(str.charAt(i)!=str.charAt(len-i-1)){
//                answer="No";
//            }
//        }
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)){
            answer= "YES";
        }else {
            answer="No";
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
