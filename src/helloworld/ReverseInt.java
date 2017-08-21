package helloworld;

import java.util.Arrays;

/**
 * Created by kth919 on 2017-08-05.
 */
/*
저장하면서 동시에 정렬?
 */
public class ReverseInt {
    public int reverseInt(int n){

        int lengthOfN = String.valueOf(n).length();
        int[] tmpList = new int[lengthOfN];
        int result = 0;

        for (int i = 0; i<lengthOfN; i++){
            tmpList[i] = n/(int)Math.pow(10, i) % 10;
        }

        Arrays.parallelSort(tmpList);

        for (int i = 0; i<tmpList.length; i++){
            result += tmpList[i] * (int)Math.pow(10, i);
        }

        return result;
    }



    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}
