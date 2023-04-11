package examples.section3;

import java.util.Scanner;

public class Ex03 {
    public int solution(int n, int k, int[] array) {
        int sum = 0;
        for(int i = 0; i < k; i++) sum += array[i];

        int result = sum;

        for(int i = k; i < n; i++) {
            sum = sum + array[i] - array[i - k];
            if(result < sum) result = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        Ex03 T = new Ex03();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) array[i] = kb.nextInt();

        System.out.println(T.solution(n, k, array));
    }
}