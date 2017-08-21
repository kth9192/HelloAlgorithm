package helloworld;

import java.util.Arrays;

/**
 * Created by kth919 on 2017-08-02.
 */
public class Divisible {
    public int[] divisible(int[] array, int divisor) {
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        int lengthToRet = 0;

        for (int i = 0; i< array.length; i++){
            if (array[i]%divisor == 0){
                lengthToRet++;
            }
        }

        int[] ret = new int[lengthToRet];

        int retLengthTmp = 0;

        for (int i = 0; i<array.length; i++){

            if (array[i]%divisor == 0) {
                ret[retLengthTmp] = array[i];
                retLengthTmp++;
            }
        }

        return ret;
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
    }
}
