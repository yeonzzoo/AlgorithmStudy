package examples.section2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
    public boolean isPrime(int num) {
        int count = 0;

        if(num == 1) return false;
        if(num == 2) return true;
        for(int i = 2; i < num; i++)
            if(num % i == 0) count++;

        return count == 0;
    }

    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> resultArr = new ArrayList<>();
        StringBuffer sb;
        int num;

        for(int i : arr) {
            sb = new StringBuffer(String.valueOf(i));
            num = Integer.parseInt(sb.reverse().toString());
            if(isPrime(num)) resultArr.add(num);
        }

        return resultArr;
    }

    public static void main(String[] args) {
        Ex06 T = new Ex06();
        Scanner kb = new Scanner(System.in);

        int num = kb.nextInt();
        int[] arr = new int[num];
        ArrayList<Integer> resultArr;

        for(int i = 0; i < num; i++)
            arr[i] = kb.nextInt();

        resultArr = T.solution(arr);

        for(Integer i : resultArr)
            System.out.print(i + " ");
    }
}
