package helloworld;

/**
 * Created by kth919 on 2017-07-31.
 */
public class StrToInt {
    public int getStrToInt(String str) {

        int result = 0;
        boolean sign = true;

        for (int i = 0; i<str.length(); i++){

            char tmp = str.charAt(i);

            if (tmp == '-') {
                sign = false;
            }else {
                result = result * 10 + (tmp - '0') ;
            }

        }

        return sign ? result : -1*result;
    }
    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("1234"));
    }
}
