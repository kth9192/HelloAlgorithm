package helloworld;

/**
 * Created by kth919 on 2017-08-13.
 */
/*
'O' 인 부분이 1 'X' 인 부분을 0이라 한다.
정사각형을 그리기 위해 1인 부분만 정사각형의 영역이라고 가정 한다.
정사각형 넓이4(가로세로2)를 위해서는 정사각형 넓이1(가로세로1)이 4개가 모인 꼴이다.
여기서 'O' = 1 = 넓이1의 정사각형이다.
구성되는 정사각형의 넓이를 구하기 위해 맨윗줄 + 맨 왼쪽줄을 제외한 나머지 구간을 탐색한다.
(넓이 2인 정사각형을 구분하기 위해 그부분을 제외하고 탐색해야 함)
탐색 구간내의 기준점에서 왼쪽, 위쪽, 왼쪽 대각선의 수를 확인한다.
여기서 제일 작은 수의 값+1 을 한 것이 현재 기준점에서 만들수 있는 정사각형의 가로세로 길이가 된다.
(22
 22 에서 우측하단이 기준이 되는 상황이라 하자. 칸 하나당 할당된 2는 그 칸의 좌측까지가 2의 정사각형
    영역이라는 뜻이다.)
    (222
     222
     222 라는 모양과 마찬가지라는 뜻이다. 따라서 넓이9의 정사각형이 된다.)
 */
public class TryBiggestSquare {

    public int findLargestSquare(char [][]board)
    {
        int answer = 0;
        int[][] tmpBoard = new int[board.length][board[0].length];

        for (int i = 0; i<board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O' ) {
                    tmpBoard[i][j] = 1;
                }
            }
        }

        for (int i = 1; i<board.length; i++){
            for (int j = 1; j<board[0].length; j++){

                if (tmpBoard[i][j] != 0) {
                    tmpBoard[i][j] = Math.min(Math.min(tmpBoard[i - 1][j], tmpBoard[i][j - 1]), tmpBoard[i - 1][j - 1]) + 1;
                    answer = Math.max(answer, tmpBoard[i][j]);

                }
            }
        }

        return (int) Math.pow(answer, 2);
    }

    public static void main(String[] args)
    {
        TryBiggestSquare test = new TryBiggestSquare();
        char [][]board ={
                {'X','O','O','O','X'},
                {'X','O','O','O','O'},
                {'X','X','O','O','O'},
                {'X','X','O','O','O'},
                {'X','X','X','X','X'}};

        System.out.println(test.findLargestSquare(board));
    }
}
