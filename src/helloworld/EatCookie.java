package helloworld;

/**
 * Created by kth919 on 2017-09-12.
 */
public class EatCookie {

    public int eatCookie(int []cookies) {
        int result = 0;
        int[] tmp = new int[cookies.length];

        for (int i = 0; i<cookies.length; i++){

            tmp[i] = 1;

            for (int j = 0; j<i; j++){
                if (cookies[i] > cookies[j] ){
                    if (tmp[i] < tmp[j] + 1 ){
                        tmp[i] ++;
                    }
                }
            }

            System.out.println(i+1 + "일때 최대" + tmp[i]);
            if (result < tmp[i]){
                result = tmp[i];
            }
        }

        return result;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        EatCookie e = new EatCookie();
        int []cookies = {1, 4, 2, 6, 3, 4, 1, 5};
        System.out.println(e.eatCookie(cookies));
    }
}
