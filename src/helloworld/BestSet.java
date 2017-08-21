package helloworld;

import java.util.Arrays;

/**
 * Created by kth919 on 2017-08-15.
 */
/*
n 만큼의 집합 개수중 합했을때 s임을 만족하는 경우의 수 중에서 이들의 곱이 최대가 되는 경우를
찾아라.
 */
public class BestSet {

    public int[] bestSet(int n, int s){

        int[] answer = null;
        int tmp = s%n;


            answer = new int[n];
            for (int i = 0; i < n; i++) {
                answer[i] = s / n;

                if (tmp > 0) {
                    answer[i]++;
                    tmp--;
                }
            }
            Arrays.parallelSort(answer);


        return answer;
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}