package examples.section1;

import java.util.Scanner;

public class Ex08 {
    public String solution(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");
        str = str.toLowerCase();
        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Ex08 T = new Ex08();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
