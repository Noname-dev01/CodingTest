package Programmers.Hash;

import java.util.HashMap;

public class Main02 {
    public boolean solution(String[] phone_book){
        HashMap<String,Integer> map = new HashMap<>();
        for (int i=0; i < phone_book.length; i++) {
            map.put(phone_book[i],1);
        }

        for (int i=0; i< phone_book.length;i++){
            for (int j=1; j<phone_book[i].length();j++){
                if (map.containsKey(phone_book[i].substring(0,j)))
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Main02 T = new Main02();
        String[] phone_book = {"123","456","789"};
        System.out.println(T.solution(phone_book));
    }
}
