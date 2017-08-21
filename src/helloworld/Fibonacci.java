package helloworld;

import java.util.ArrayList;

/**
 * Created by kth919 on 2017-08-03.
 */
public class Fibonacci {
    public long fibonacci(int num) {

        long answer = 0;

        ArrayList<Long> al = new ArrayList();

        al.add(0, (long) 0);
        al.add(1, (long) 1);

        if(num >= 2){
            for (int i = 2; i<=num; i++){
                al.add(i, al.get(i-2) + al.get(i-1));
//                System.out.println("i는" +i +" : " + al.get(i));
            }
        }

        answer = al.get(num);

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Fibonacci c = new Fibonacci();
        int testCase = 3;
        System.out.println(c.fibonacci(testCase));
    }
}
