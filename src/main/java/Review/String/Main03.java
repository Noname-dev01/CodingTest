package Review.String;

import java.util.Scanner;

public class Main03 {
    public String solution(String str){
        String answer = "";
        String[] split = str.split(" ");
        answer=split[0];
        for (int i=0; i<split.length; i++) {
            if (answer.length()<split[i].length()) answer=split[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
