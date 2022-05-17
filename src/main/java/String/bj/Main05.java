package String.bj;

import java.util.Scanner;

public class Main05 {
    public String solution(String str){
        String answer="";
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)>=65){
                answer+=str.charAt((str.length()-i)-1);
            }else{
                answer+=str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main05 T = new Main05();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
