package Review.String;

import java.util.Scanner;

public class Main02 {
    public String solution(String str){
        String answer = "";
        for (int i=0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i))){
                answer+=Character.toLowerCase(str.charAt(i));
            }else{
                answer+=Character.toUpperCase(str.charAt(i));
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
