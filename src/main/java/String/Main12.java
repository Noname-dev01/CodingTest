package String;

import java.util.Scanner;

public class Main12 {
    public String solution(int n,String word){
        String answer ="";
        for(int i=0; i<n; i++){
            String tmp=word.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp,2);
            answer+=(char)num;
            word=word.substring(7);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n,str));
    }
}
