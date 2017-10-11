package helloworld;

/**
 * Created by kth919 on 2017-09-10.
 */
/*
// 2*tmp[i-j] 은 4이상 짝수에서 특정 패턴의 타일배치가
무조건 두개 존재하므로 앞에서부터 동적 계획으로 n까지 계산해갈때,
3*tmp[i-2] 은 이전에 tmn[2] 가 붙는 경우이며
그 이상이 뒤에서 붙는 경우 무조건 붙는 두개에 (N= 3, 4... 인 경우)
남은 거리의 경우의수를 곱하는 것이다.
*/
public class Tiling3N {
    public int tiling(int n) {
        int answer = 0;
        int[] tmp = new int[n+1];

        tmp[0] = 1;
        tmp[1] = 0;
        tmp[2] = 3;

        for (int i = 4; i<=n; i+=2){
            tmp[i] = 3*tmp[i-2];
            System.out.println(i+"일때" + "2인경우" + tmp[i]);
            for (int j = 4; j<=i; j+=2){
                System.out.println(i+"일때" + "앞에" + (i-j) + "만큼 존재 " + 2*tmp[i-j]);
                tmp[i] += 2*tmp[i-j];
            }
            tmp[i] %= 100000;
        }

        System.out.println(tmp[n]);
        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Tiling3N t = new Tiling3N();
        System.out.println(t.tiling(6));
    }
}
