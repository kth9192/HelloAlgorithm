package helloworld;

/**
 * Created by kth919 on 2017-07-31.
 */
public class EvenOrOdd {
    String evenOrOdd(int num) {
        String result = "";

        if (num%2 == 0){
//            System.out.println("시스템로그" + num%2);
            result = "Even";

        }else {
//            System.out.println("시스템로그" + num%2);
            result = "Odd";
        }

        return result;
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(-3));
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(-2));
    }
}
