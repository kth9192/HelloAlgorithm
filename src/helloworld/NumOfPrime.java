package helloworld;

/**
 * Created by kth919 on 2017-08-06.
 */
public class NumOfPrime {
    int numberOfPrime(int n) {
        int result = 0;
        // 함수를 완성하세요.

        boolean[] tmp = new boolean[n];

        for (int i = 0; i<n; i++){
            if (i == 0){
                tmp[i] = false;
            }else {
                tmp[i] = true;
            }
        }

        for (int i = 2; i<=(int)Math.sqrt(n); i++){

            if (tmp[i-1]){
                for (int j = i+i ; j<=n; j+=i ){
                    tmp[j-1] = false;
                }
            }
        }

        for (int i = 0; i<tmp.length; i++){
            if (tmp[i]){
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        NumOfPrime prime = new NumOfPrime();
        System.out.println( prime.numberOfPrime(238) );
    }
}
