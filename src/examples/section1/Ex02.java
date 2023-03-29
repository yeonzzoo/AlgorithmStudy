package examples.section1;

import java.util.Scanner;

public class Ex02 {
    public String solution(String str) {
        String result = "";

        for(char c : str.toCharArray()) {
            if(Character.isLowerCase(c))
                result += Character.toUpperCase(c);
            else
                result += Character.toLowerCase(c);
        }

        return result;
    }

    public static void main(String[] args) {
        Ex02 T = new Ex02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
