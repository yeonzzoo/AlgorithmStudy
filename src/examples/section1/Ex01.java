package examples.section1;

import java.util.Scanner;

public class Ex01 {
    public int solution(String str, char c) {
        int result = 0;
        String str2 = str.toLowerCase();
        char c2 = Character.toLowerCase(c);

        for(int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) == c2) result++;
        }

        return result;
    }

    public static void main(String[] args){
        Ex01 T = new Ex01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
