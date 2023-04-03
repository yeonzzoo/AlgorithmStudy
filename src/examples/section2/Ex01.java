package examples.section2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public ArrayList<Integer> solution(int number, ArrayList<Integer> arrayList) {
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(arrayList.get(0));

        for(int i = 1; i < arrayList.size(); i++) {
            if(arrayList.get(i-1) > arrayList.get(i)) continue;
            else resultList.add(arrayList.get(i));
        }

        return resultList;
    }

    public static void main(String[] args) {
        Ex01 T = new Ex01();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < number; i++)
            arrayList.add(kb.nextInt());

        ArrayList<Integer> resultList = T.solution(number, arrayList);
        for (Integer i : resultList) {
            System.out.print(i + " ");
        }
    }
}
