package helloworld;

/**
 * Created by kth919 on 2017-08-15.
 */
public class Expressions {
    public int expressions(int num) {
        int answer = 0;

        for (int i = 1; i<=num; i++){
           for (int j = 1; j<num; j++){
             if (2*num == 2*i*j + j*(j-1)){
                 answer++;
//                 System.out.println("i는 시작자연수" + i + ": j는 자연수의 갯수" + j);
             }
           }
        }
        return answer;
    }


    public static void main(String args[]) {
        Expressions expressions = new Expressions();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(expressions.expressions(15));
    }
}
