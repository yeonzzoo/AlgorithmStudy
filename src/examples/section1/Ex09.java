package examples.section1;

import java.util.Scanner;

public class Ex09 {
    public int solution(String str) {
        String result = "";

        for(char ch : str.toCharArray()) {
            if(Character.isDigit(ch)) result += ch;
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        Ex09 T = new Ex09();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
