package helloworld;

/**
 * Created by kth919 on 2017-08-05.
 */
public class HarshadNumber {

    public boolean isHarshad(int num){

        boolean answer = false;
        String tmp = Integer.toString(num);
        int tmpHarshad = 0;

        tmpHarshad = num%10;
        for (int i = 1; i<tmp.length(); i++){

            tmpHarshad += (num /(int)Math.pow(10, i)) % 10;

        }

        if (num % tmpHarshad == 0){
            answer = true;
        }

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(152));
    }
}
