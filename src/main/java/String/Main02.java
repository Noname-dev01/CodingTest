package String;

import java.util.Scanner;

public class Main02 {
    public String solution(String str){
        String answer="";
        for (char x : str.toCharArray()){
            if (Character.isUpperCase(x)){
                answer+=Character.toLowerCase(x);
            }else{
                answer+=Character.toUpperCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
