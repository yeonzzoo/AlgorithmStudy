package examples.section2;

import java.util.Scanner;

public class Ex05 {
    public int solution(int num) {
        int result=0;
        int[] ch = new int[num+1];
        for(int i = 2; i <= num; i++){
            if(ch[i] == 0){
                result++;
                for(int j = i; j <= num; j = j + i)
                    ch[j] = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Ex05 T = new Ex05();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.solution(kb.nextInt()));
    }
}
