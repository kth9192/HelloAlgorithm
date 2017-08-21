package helloworld;

import java.util.Arrays;

/**
 * Created by kth919 on 2017-08-03.
 */
public class TryHelloWorld
{
    public int[] gcdlcm(int a, int b) {

        int[] answer = new int[2];

        answer[0] = GCMEuclidean(a, b);
        answer[1] = (a * b) / answer[0];

        return answer;
    }

    public int GCMEuclidean(int a, int b){

        if (a > b){
            System.out.println("a가큼"+b);
           return a%b != 0 ? GCMEuclidean(b, a%b) : b;
        } else {
            System.out.println("b가큼"+a);
            return b%a != 0 ? GCMEuclidean(a, b%a) : a;
        }

    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}