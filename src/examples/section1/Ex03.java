package examples.section1;

import java.util.Scanner;

public class Ex03 {
    public String solution(String str) {
        String[] strList = str.split(" ");
        int max = 0;
        int index = 0;

        for(int i = 0; i < strList.length; i++) {
            if(strList[i].length() == max) continue;
            else if(strList[i].length() > max) {
                max = strList[i].length();
                index = i;
            }
        }

        return strList[index];
    }

    public static void main(String[] args) {
        Ex03 T = new Ex03();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
