package examples.section2;

import java.util.Scanner;

public class Ex03 {
    public String solution(int x, int y) {
        if(x == y) return "D";
        else if(x == 1) {
            if(y == 2) return "B";
            else return "A";
        }
        else if(x == 2) {
            if(y == 3) return "B";
            else return "A";
        }
        else if(x == 3) {
            if(y == 1) return "B";
            else return "A";
        }

        return null;
    }

    public static void main(String[] args) {
        Ex03 T = new Ex03();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] A = new int[num];
        int[] B = new int[num];

        for(int i = 0; i < num; i++) A[i] = kb.nextInt();
        for(int i = 0; i < num; i++) B[i] = kb.nextInt();
        for(int i = 0; i < num; i++) System.out.println(T.solution(A[i], B[i]));
    }
}
