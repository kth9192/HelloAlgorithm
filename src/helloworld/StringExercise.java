package helloworld;

/**
 * Created by kth919 on 2017-08-02.
 */
/*
1. 문자열길이판별
2. 길이 중 중간 범위 판별 - 홀수는 가운데 짝수는 가운데에서 가까운 곳 두개
3. 중간 범위의 문자열 도출
 */
public class StringExercise{

    String getMiddle(String word){

//        StringBuilder sb = new StringBuilder();
//
//        if(word.length()%2 == 1){
//            //홀
//            sb.append(word.charAt(word.length()/2));
//        }else {
//            //짝
//            sb.append(word.charAt(word.length()/2-1));
//            sb.append(word.charAt(word.length()/2));
//        }

        return (word.length()%2 == 1) ? word.substring(word.length()/2, word.length()/2+1) : word.substring(word.length()/2 - 1 , word.length()/2 +1 );

    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("test12"));
    }
}
