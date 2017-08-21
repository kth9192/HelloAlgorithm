package helloworld;

/**
 * Created by kth919 on 2017-08-01.
 */
/*
1. 문자를 받고 한글자씩자름
2. 아스키코드를 비교해 우열을 가름
3. 아스키코드 큰것부터 정렬
 */
public class ReverseStr {

    public String reverseStr(String str){

        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        insertSort(ch);

        for(int i = 0; i<ch.length; i++){
            sb.append(ch[i]);
        }

        return sb.toString();
    }

   public void insertSort(char[] ch){

        char standard;

        for (int i = 1; i<ch.length; i++){
            standard = ch[i];
            int tmp = i-1;

            while (tmp >= 0 && (int)standard > (int)ch[tmp]){

                ch[tmp+1] = ch[tmp];
                tmp--;
            }
            ch[tmp+1] = standard;
        }
   }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }

}
