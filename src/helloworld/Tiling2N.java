package helloworld;

import java.math.BigInteger;

/**
 * Created by kth919 on 2017-09-05.
 */
public class Tiling2N {

    /*
    가로 또는 세로가 2이고 나머지가 1인 타일을 이용해 2xN 크기의 보드판을 채우는 알고리즘
    타일은 가로 세로 모두 배치할 수 있다.

    1. 문제의 요점은 N만 큼의 길이를 길이 1짜리 타일 2짜리 타일들로 어느 자리에 얼마만큼 배치할 수 있느냐에 따른 경우의 수 총합이다.
    2. 가로로 놓은 타일을 A , 세로로 놓인 타일을 B라 할때
    A + B = N.
    A와 B가 보드판의 가로를 차지하는 비율을 고려할 때,
    a + b = N (단, a = 2b)
     */
//    public int tiling(int n) {
//
//        BigInteger result = new BigInteger("0");
//
//         //i 가 가로로 놓을때 j 가 세로
//        for (int i = 0; i<= n/2; i++){
//            for (int j = 0; j<=n; j++){
//                if (i*2 + j == n){
//
//                    if (i != 0 && j != 0) {
//                        result = result.add( factorial(i+j).divide(factorial(i).multiply(factorial(j) ) ) );
//
//                        System.out.println("i " + i + " 일때 " + "j " + j + " 결과" + factorial(i+j).divide(factorial(i).multiply(factorial(j) ) )  );
//
//                    } else {
//                        System.out.println("i " + i + " 일때 " + "j " + j + " 결과" + "1");
//
//                        result = result.add(BigInteger.ONE);
//                    }
//                }
//            }
//        }
//
//        return (result.toString().length() < 5) ? Integer.parseInt(result.toString()) : Integer.parseInt(String.valueOf(sliceFiveChar(result)));
//    }
//
//    public BigInteger factorial(int n){
//
//        BigInteger fac = BigInteger.ONE;
//
//        for (int i = 1; i<=n; i++){
//            fac = fac.multiply(BigInteger.valueOf(i));
//        }
//
//        return fac;
//    }
//
//    public long sliceFiveChar(BigInteger n){
//
//        String tmp = n.toString();
//        String tmpResult = tmp.substring(tmp.length() - 5 , tmp.length());
//        long result = Long.parseLong(tmpResult);
//
//        return result;
//    }

    //피보나치. http://grayt.tistory.com/168 참고.
    public int tiling(int n) {
        int a = 1;
        int b = 1;
        for (int i = 0; i < n - 1; i++) {
            int fib = (a + b) % 100000; //끝5자리와 그중 0을 제외하기 위한 연산
            a = b;
            b = fib;
        }
        return b;
    }

    public static void main(String args[]) {
        Tiling2N tiling2N = new Tiling2N();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.print(tiling2N.tiling(64));
    }
}
