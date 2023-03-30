package examples.section1;

import java.util.Scanner;

public class Ex12 {
    public String solution(String str, int num) {
        String change = "";
        String result = "";

        for(char ch : str.toCharArray()) {
            if(ch == '#') change += "1";
            else if(ch == '*') change += "0";
        }

        for(int i = 0; i < num; i++) {
            String s = "";
            for(int j = i * 7; j < i * 7 + 7; j++) {
                s += change.charAt(j);
            }
            int n = Integer.parseInt(s, 2);
            result += (char)n;
        }

        return result;
    }

    public static void main(String[] args) {
        Ex12 T = new Ex12();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(str, num));
    }
}
