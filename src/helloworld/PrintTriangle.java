package helloworld;

/**
 * Created by kth919 on 2017-08-01.
 */
/*
1.
 */
public class PrintTriangle {
    public String printTriangle(int num){

        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i<=num; i++){

            sb.append("*");

            result.append(sb.toString());
            result.append("\n");

        }

        return result.toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        PrintTriangle pt = new PrintTriangle();
        System.out.println("결과\n" + pt.printTriangle(5) );
    }
}
