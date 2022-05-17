package String;

import java.util.Scanner;

public class KakaoString1 {
    public int solution(String s){
        int answer = 0;
        String check="";
        s=s+" ";
        int cnt=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) cnt++;
            else{
                if(cnt>1) check+=String.valueOf(cnt);
                check+=s.charAt(i);
                cnt=1;
            }
        }
        int answer1 = check.length();
        return answer;
    }
    public static void main(String[] args) {
        KakaoString1 T = new KakaoString1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
