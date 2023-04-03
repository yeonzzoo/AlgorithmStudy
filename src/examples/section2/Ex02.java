package examples.section2;

import java.util.Scanner;

public class Ex02 {
    public int solution(int[] arr) {
        int result = 1;
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Ex02 T = new Ex02();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] students = new int[num];

        for(int i = 0; i < num; i++)
            students[i] = kb.nextInt();

        System.out.println(T.solution(students));
    }
}
