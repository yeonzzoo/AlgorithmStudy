package examples.section1;

import java.util.Scanner;

public class Ex10 {
    public String solution(String str, char ch) {
        int[] arr1 = new int[str.length()];
        int[] arr2 = new int[str.length()];
        int distance = 1000;
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) distance = 0;
            else distance++;

            arr1[i] = distance;
        }

        for(int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i) == ch) distance = 0;
            else distance++;
            arr2[i] = distance;
        }

        for(int i = 0; i < str.length(); i++) {
            if(arr1[i] < arr2[i]) result += String.valueOf(arr1[i]);
            else result += String.valueOf(arr2[i]);
            result += " ";
        }

        return result;
    }

    public static void main(String[] args) {
        Ex10 T = new Ex10();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char ch = kb.next().charAt(0);
        System.out.println(T.solution(str, ch));
    }
}
