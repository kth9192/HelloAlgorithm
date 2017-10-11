package helloworld;

/**
 * Created by kth919 on 2017-09-30.
 */
public class Nqueen {

    public static int result = 0;

    public int nQueen(int n) {

        for (int i = 0; i < n; i ++) {
            int[] queens = new int[n];
            queens[0] = i;

            backTracking(n, i, 1, queens);

        }

        return result;
    }

    public void backTracking(int n, int position, int level,  int[] queens) {
        System.out.println("이전" + position);

        if (level == n){

           result++;

           System.out.println("종료" + result);

        }else {
            for (int i = 0; i < n; i ++) {
                queens[level] = i;

                if (isAlright(queens, level)) {
                    backTracking(n, i, level + 1, queens);
                }
            }
        }

    }

    public void backTracking(int n) {

        int[] queens = new int[n];
        int level = 0;

        //높이
        for (int i = 0; i < n; i++) {
            //가로
            for (int j = 0; j < n; j++) {
                queens[i] = j;
                if (isAlright(queens, i)){

                }
            }

        }
    }

    public boolean isAlright( int[] queens , int level){

        boolean answer = true;

        for (int i = 0; i<level; i++){
            if (queens[i] == queens[level] || Math.abs(queens[level] - queens[i]) == Math.abs(level - i) ){
                answer = false;
            }
        }

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Nqueen nq = new Nqueen();
        System.out.println(nq.nQueen(4));
    }
}
