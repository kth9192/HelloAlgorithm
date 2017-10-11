package helloworld;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kth919 on 2017-09-09.
 */
/*
스택, 재귀?
 */
class Hanoi {
    public int[][] hanoi(int n) {
        // 2차원 배열을 완성해 주세요.
        int[][] answer;
        ArrayList<int[]> tmp =  new ArrayList();

        shift(n, 1, 2, 3, tmp);
        answer = new int [tmp.size()][2];

        for (int i = 0; i<tmp.size(); i++){
            answer[i] = tmp.get(i);
        }

        return answer;
    }

    public void initTmp(int start, int end, ArrayList<int[]> tmp){
        System.out.println("initTmp" + start +"에서" + end);
        tmp.add(new int[]{start, end});
    }

    public void shift(int n, int start, int mid, int end , ArrayList<int[]> tmp){
        if (n == 1){
            initTmp(start, end, tmp);
        }else {
            shift(n-1, start, end, mid, tmp);
            initTmp(start, end, tmp);
            shift(n-1, mid, start, end, tmp);
        }
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Hanoi h = new Hanoi();
        System.out.println(Arrays.deepToString(h.hanoi(2)));
    }

}
