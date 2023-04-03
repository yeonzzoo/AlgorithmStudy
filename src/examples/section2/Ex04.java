package examples.section2;

import java.util.Scanner;

public class Ex04 {
    public int[] solution(int num) {
        int[] fibo = new int[num];
        fibo[0] = 1;
        fibo[1] = 1;
        for(int i = 2; i < num; i++) {
            fibo[i] = fibo[i-2] + fibo[i-1];
        }

        return fibo;
    }

    public static void main(String[] args) {
        Ex04 T = new Ex04();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        for(int i = 0; i < num; i++)
            System.out.print(T.solution(num)[i] + " ");
    }
}
