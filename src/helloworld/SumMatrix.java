package helloworld;

/**
 * Created by kth919 on 2017-08-03.
 */
public class SumMatrix {

    int[][] sumMatrix(int[][] A, int[][] B) {

        int[][] answer = new int[A.length][A[0].length];

        int i = 0;
        int j = 0;
        int count = 0;

        System.out.println(A.length + " : " + A[0].length);

        while (count != A.length * A[0].length ){

           answer[i][j] = A[i][j] + B[i][j];
           System.out.println("행" + i + "열" + j+ ":" + answer[i][j]);

            if (j == A[0].length-1 ){
                j = 0;
                i++;
            } else {
                j++;
            }

            count++;

        }

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        SumMatrix c = new SumMatrix();
        int[][] A = { { 1, 2 }, { 2, 3 }, {1, 1} };
        int[][] B = { { 3, 4 }, { 5, 6 }, {1, 1} };
        int[][] answer = c.sumMatrix(A, B);
        if (answer[0][0] == 4 && answer[0][1] == 6 &&
                answer[1][0] == 7 && answer[1][1] == 9 && answer[2][0] == 2 && answer[2][1] == 2) {
            System.out.println("맞았습니다. 제출을 눌러 보세요");
        } else {
            System.out.println("틀렸습니다. 수정하는게 좋겠어요");
        }
    }
}

