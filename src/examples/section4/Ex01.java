package examples.section4;

import java.util.HashMap;
import java.util.Scanner;

public class Ex01 {
    public char solution(int n, String vote) {
        char result = ' ';
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for(char c : vote.toCharArray())
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);

        for(char c : hashMap.keySet()) {
            if(hashMap.get(c) > max) {
                max = hashMap.get(c);
                result = c;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Ex01 T = new Ex01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String vote = kb.next();
        System.out.println(T.solution(n, vote));
    }
}
