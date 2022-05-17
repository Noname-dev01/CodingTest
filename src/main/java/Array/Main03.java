package Array;


import java.util.Scanner;

public class Main03 {
    public String solution(int n, int[] userA, int[] userB){
        String answer = "";
        for (int i=0; i<n; i++){
            if(userA[i]==userB[i]) answer += "D";
            else if (userA[i]==1 && userB[i]==2) answer += "B";
            else if (userA[i]==1 && userB[i]==3) answer +="A";
            else if (userA[i]==2 && userB[i]==1) answer +="A";
            else if (userA[i]==2 && userB[i]==3) answer +="B";
            else if (userA[i]==3 && userB[i]==1) answer +="B";
            else if (userA[i]==3 && userB[i]==2) answer +="A";
        }
        return answer;
    }
    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] userA = new int[num];
        int[] userB = new int[num];
        for (int i=0;i<num;i++){
            userA[i]=sc.nextInt();
        }
        for (int i=0;i<num;i++){
            userB[i]=sc.nextInt();
        }
        for (char x:T.solution(num,userA,userB).toCharArray()) {
            System.out.println(x);
        }
    }
}
