package examples.section1;

import java.util.Scanner;

public class Ex04 {
    public String solution(String str) {
        String result = "";

        for(int i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }

    public static void main(String[] args) {
        Ex04 T = new Ex04();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String[] strings = new String[num];

        for(int i = 0; i < num; i++) {
            strings[i] = kb.next();
        }

        for(int i = 0; i < num; i++) {
            System.out.println(T.solution(strings[i]));
        }
    }
}
