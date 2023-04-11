package examples.section3;

import java.util.Scanner;

public class Ex04 {
    public int solution(int n, int k, int[] array) {
        int result = 0, sum = 0, i = 0, point = 0;

        while(i < n) {
            if(sum == k) {
                result++;
                point++;
                i = point;
                sum = 0;
            }
            else if(sum > k) {
                point++;
                i = point;
                sum = 0;
            }
            else {
                sum += array[i];
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Ex04 T = new Ex04();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) array[i] = kb.nextInt();
        System.out.println(T.solution(n, k, array));
    }
}
