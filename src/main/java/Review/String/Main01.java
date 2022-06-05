package Review.String;

import java.util.Scanner;

public class Main01 {
    public int solution(String str, String a){
        int answer = 0;
        str = str.toLowerCase();
        char text = a.toLowerCase().charAt(0);
        for (int i=0; i<str.length();i++){
            if (str.charAt(i)==text) answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main01 T = new Main01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String a = sc.next();
        System.out.println(T.solution(str,a));
    }
}
