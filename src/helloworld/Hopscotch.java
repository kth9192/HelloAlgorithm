package helloworld;

/**
 * Created by kth919 on 2017-08-15.
 */
/*
행렬에 가장 큰 수를 골라 더한다.
이때, 이전에 골랐던 자리는 연속해서 다시 고를 수 없다.
덧셈의 일반적인 큰 경우는 각 배열당 가장 큰수만 골라 더하면된다.
하지만 중복 위치를 고를 수 없기 때문에 배열마다 가장 큰 수를 고르는 것이 아니라 ,
이후에 더해질 수를 포함했을때 더 좋은 경우의 수를 고를수 있어야 한다.

 */
public class Hopscotch {
    int hopscotch(int[][] board, int size) {
        int result = 0;
        int tmp = -1;
        int[] tmpArr = new int[size];
        int preTmp = 0;
        int preIdx = -1;

        for (int i = 0; i<size-1; i++){
            for (int j = 0; j<board[0].length; j++) {
                for (int k = 0; k<board[0].length; k++) {

                    if (tmp < board[i][j] + board[i + 1][k] && j != k && preIdx != j){
                        tmp = board[i][j] + board[i + 1][k];
                        tmpArr[i] = board[i][j];
                        preTmp = j;
                    }
                }
            }
            preIdx = preTmp;
            System.out.println(i+ "일때 조사하면 안되는" + preIdx);
            tmp = -1;
        }

        for (int i = 0; i<board[0].length; i++){
            tmp = Math.max(tmp , board[board.length-1][i]) ;
        }
        System.out.println(tmp);

        for (int i = 0; i<tmpArr.length; i++){
            System.out.println(i+"는" + tmpArr[i]);
            result += tmpArr[i];
        }

        return result + tmp;
    }

    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = {{5, 6, 3, 6}, {8, 10, 9, 10}, {3, 5, 5, 6},
                        {10, 4, 2, 8}, {5, 9, 10, 7}, {6, 9, 6, 3},
                        {3, 7, 4, 10}, {8, 4, 4, 4}, {3, 4, 8, 4},
                        {2, 1, 1, 7}};
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.hopscotch(test, 10));
    }
}