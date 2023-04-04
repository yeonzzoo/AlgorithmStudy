package examples.section2;

import java.util.Scanner;

public class Ex07 {
    public int solution(int num, int[] arr) {
        int[] resultArr = new int[num];
        int score = 0, sum = 0;

        for(int i = 0; i < num; i++) {
            if(arr[i] == 0) {
                resultArr[i] = 0;
                score = 0;
            }
            else {
                score++;
                resultArr[i] = score;
            }
        }

        for(int i : resultArr) sum += i;

        return sum;
    }

    public static void main(String[] args) {
        Ex07 T = new Ex07();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++)
            arr[i] = kb.nextInt();

        System.out.println(T.solution(num, arr));
    }
}
