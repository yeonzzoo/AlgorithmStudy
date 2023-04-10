package examples.section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
    public ArrayList<Integer> solution(int anum, int bnum, int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;

        while(p1 < anum && p2 < bnum) {
            if(a[p1] == b[p2]) {
                result.add(a[p1]);
                p1++; p2++;
            }
            else if(a[p1] > b[p2]) p2++;
            else if(a[p1] < b[p2]) p1++;
        }

        return result;
    }

    public static void main(String[] args) {
        Ex02 T = new Ex02();
        Scanner kb = new Scanner(System.in);

        int anum = kb.nextInt();
        int[] a = new int[anum];
        for(int i = 0; i < anum; i++) a[i] = kb.nextInt();

        int bnum = kb.nextInt();
        int[] b = new int[bnum];
        for(int i = 0; i < bnum; i++) b[i] = kb.nextInt();

        ArrayList<Integer> result = T.solution(anum, bnum, a, b);
        for(int i : result) System.out.print(i + " ");
    }
}