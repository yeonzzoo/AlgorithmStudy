package examples.section1;

import java.util.Scanner;

public class Ex05 {
    public String solution(String str) {
        char[] ch = str.toCharArray();
        int lt = 0;
        int rt = ch.length - 1;

        while(lt < rt) {
            if((ch[lt] < 'a' || ch[lt] > 'z') && (ch[lt] < 'A' || ch[lt] > 'Z'))
                lt++;
            else if((ch[rt] < 'a' || ch[rt] > 'z') && (ch[rt] < 'A' || ch[rt] > 'Z'))
                rt--;
            else {
                char temp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = temp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        Ex05 T = new Ex05();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
