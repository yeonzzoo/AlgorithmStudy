package examples.section3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public ArrayList<Integer> solution(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while(p1 < a.length && p2 < b.length) {
            if(a[p1] <= b[p2]) {
                result.add(a[p1]);
                p1++;
            }
            else {
                result.add(b[p2]);
                p2++;
            }
        }

        if(p1 == a.length)
            for(int i = p2; i < b.length; i++) result.add(b[i]);
        else
            for(int i = p1; i < a.length; i++) result.add(a[i]);

        return result;
    }

    public static void main(String[] args) {
        Ex01 T = new Ex01();
        Scanner kb = new Scanner(System.in);

        int anum = kb.nextInt();
        int[] a = new int[anum];
        for(int i = 0; i < anum; i++)
            a[i] = kb.nextInt();

        int bnum = kb.nextInt();
        int[] b = new int[bnum];
        for(int i = 0; i < bnum; i++)
            b[i] = kb.nextInt();

        ArrayList<Integer> result = T.solution(a, b);
        for(int i = 0; i < result.size(); i++)
            System.out.println(result.get(i) + " ");
    }
}
