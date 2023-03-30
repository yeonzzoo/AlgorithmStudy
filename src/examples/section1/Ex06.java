package examples.section1;

import java.util.Scanner;

public class Ex06 {
    public String solution(String str) {
        String result = "";

        for(char ch : str.toCharArray()) {
            if(result.contains(String.valueOf(ch))) continue;
            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        Ex06 T = new Ex06();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
