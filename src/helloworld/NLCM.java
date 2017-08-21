package helloworld;

/**
 * Created by kth919 on 2017-08-10.
 */
public class NLCM {
    public long nlcm(int[] num) {

        long tmpAns = 0;

        for (int i = 0; i<num.length; i++) {
            if (i == 0) {
                tmpAns = getGCD(num[i], num[i + 1]);
            }else {
                tmpAns = getGCD(tmpAns, num[i]);
            }
        }

        return tmpAns;
    }

    public long getGCD(long a, long b){

        long tmp;
        long tmpA = a;
        long tmpB = b;

        while (tmpB!= 0){
            tmp = tmpB;
            tmpB = tmpA%tmpB;
            tmpA = tmp;
        }

        return (a*b)/tmpA;
    }

    public static void main(String[] args) {
        NLCM c = new NLCM();
        int[] ex = { 2, 6, 8, 14 };
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.nlcm(ex));
    }
}
