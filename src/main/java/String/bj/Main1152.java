package String.bj;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1152 {
    public int solution(String str){
        int answer = 0;
        StringTokenizer st = new StringTokenizer(str," ");
        answer=st.countTokens();

        return answer;
    }
    public static void main(String[] args) {
        Main1152 T = new Main1152();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
