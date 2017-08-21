package helloworld;

import java.util.Arrays;

/**
 * Created by kth919 on 2017-08-04.
 */
public class TryMinSum {


    public int getMinSum(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i<A.length; i++){
            answer = answer + (A[i] * B[B.length -1 - i]);
        }

        return answer;
    }
    public static void main(String[] args)
    {
        TryMinSum test = new TryMinSum();
        int []A = {1,2};
        int []B = {3,4};
        System.out.println(test.getMinSum(A,B));
    }
}
