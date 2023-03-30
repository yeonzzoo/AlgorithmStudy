package examples.section1;

import java.util.Scanner;

public class Ex11 {
    public String solution(String str) {
        int num = 1;
        String result = "";

        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                num++;
            }
            else {
                result += str.charAt(i);
                if(num != 1) {
                    result += num;
                    num = 1;
                }
            }
        }

        result += str.charAt(str.length()-1);
        if(num != 1) result += num;

        return result;
    }

    public static void main(String[] args) {
        Ex11 T = new Ex11();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
