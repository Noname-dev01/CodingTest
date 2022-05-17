package String;

import java.util.Scanner;

public class Main09 {
    public int solution(String s){
        String  answer = "";
        for (char x : s.toCharArray()){
            if(Character.isDigit(x)) answer+=x;
        }
//        int answer = 0;  아스키 넘버 쓰는 방법
//        for (char x : s.toCharArray()){
//            if (x>=48 && x<=57) answer=answer*10+(x-48);
//        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main09 T = new Main09();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
