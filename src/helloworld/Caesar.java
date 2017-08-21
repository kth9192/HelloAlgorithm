package helloworld;

/**
 * Created by kth919 on 2017-08-11.
 */
/*
- 대소문자 판별 -> 서로 같은 자리수 만큼만 아스키코드에 할당되어있는 것을 이용
알파벳 26자.
- n만큼 더한 아스키코드를 문자열로 반환
-

1. 소대문자 따로
2. 범위를 아무리 넘어가는 큰 n 이어도 반응해야함.
 */
public class Caesar {

    String caesar(String s, int n) {

        StringBuilder result = new StringBuilder();
        char[] a = s.toCharArray();
        int tmpN = n;

        for (int i = 0; i<s.length(); i++){

            if (s.charAt(i) != 32) {

                while (tmpN>0){

                    a[i] = (char) (a[i] + 1);

                    if (a[i] > 'z' ){
                        a[i] = 'a';
                    } else if (a[i] > 'Z' && s.charAt(i) < 'a' ){
                        a[i] = 'A';
                    }
                    tmpN--;
                }
            }

            tmpN = n;
            result.append(a[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Caesar c = new Caesar();
        System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("vbiLIJSBXF", 34));
    }
}
