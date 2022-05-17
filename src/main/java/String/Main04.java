package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Main04 {
    public ArrayList<String> solution(int count, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        //한방에 뒤집는 방법
        //        for (String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
        //한개한개씩 뒤집기
        for (String x : str){
            char [] s = x.toCharArray();
            int lt=0, rt=x.length();
            while (lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] str = new String[count];
        for (int i=0; i<count;i++){
            str[i] = sc.next();
        }
        for (String x : T.solution(count, str)) {
            System.out.println(x);
        }
    }
}
