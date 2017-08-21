package helloworld;

/**
 * Created by kth919 on 2017-07-31.
 */

/*문자열길이만큼 두가지 글자를 반복하는 클래스
*1. 길이 측정
* 2. 홀수인지 짝수인지 구분
 * 3. 홀짝에 따른 수 or 박 분배*/

public class WaterMelon {

    private String watermelon(int n){

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i<=n; i++){

            if (i%2 == 0){
                sb.append("박");
            } else {
                sb.append("수");
            }
        }

        return sb.toString();
    }

    // 실행을 위한 테스트코드입니다.
    public static void  main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}
