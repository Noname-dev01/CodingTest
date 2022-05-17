package String;

import java.util.Locale;
import java.util.Scanner;

public class Example01 {
    public int solution(String str, char t){
        int answer = 0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
        //System.out.println(str+"  "+t);
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)==t){
//                answer++;
//            }
//        }
        for(char x : str.toCharArray()){
            if (x==t)
                answer++;
        }
        return answer;
    }


    public static void main(String[] args) {
    Example01 T = new Example01();
    Scanner in = new Scanner(System.in);
    String str = in.next();
    char c = in.next().charAt(0);
        System.out.println(T.solution(str, c));

    }
}
