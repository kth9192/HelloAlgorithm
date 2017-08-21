package helloworld;

/**
 * Created by kth919 on 2017-08-09.
 */
/*
피보나치 수열 -> (n-2) + (n-1) 이면,
num 이 주어질때 1부터 num-1 까지의 피보나치 수열 인자를 모두 알고 있어야함.
 */
public class JumpCase {
    public int jumpCase(int num) {

        int[] tmp = new int[num];

        for (int i = 0; i<num; i++){
            if (i == 0 || i == 1){
                tmp[i] = i+1;
            }else {
                tmp[i] = tmp[i-1] + tmp[i-2];
            }

        }

        return tmp[num-1];
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 20;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }
}
