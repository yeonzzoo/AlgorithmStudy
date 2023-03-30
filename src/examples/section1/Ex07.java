package examples.section1;

import java.util.Scanner;

public class Ex07 {
    public String solution(String str) {
        str = str.toLowerCase();
        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Ex07 T = new Ex07();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
