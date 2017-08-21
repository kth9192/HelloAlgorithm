package helloworld;

/**
 * Created by kth919 on 2017-08-07.
 */
public class Collatz {

    public int collatz(int num) {
        int answer = 0;

        while (num != 1){
            if(num%2 == 1){
                num = (num*3)+1;
                answer++;
            }else {
                num = num/2;
                answer++;
            }

            if (answer > 500){
                return -1;
            }
        }

        return answer;
    }

//    public int collatz(int num) {
//        int count = 0;
//       return CollatzRecursion(num, count);
//    }
//
//    public int CollatzRecursion(int num, int count){
//
//        int tmp = num;
//        int tmpCount = count;
//
//        if(tmp%2 == 1){
//            tmp = (tmp*3)+1;
//            tmpCount++;
//        }else {
//            tmp = tmp/2;
//            tmpCount++;
//        }
//
//        if (tmp == 1){
//            System.out.println("반환" + tmpCount);
//            return tmpCount;
//        }else if(count == 500) {
//            return -1;
//        }else {
//            System.out.println("재귀" + tmpCount + "몫" + tmp);
//            return CollatzRecursion(tmp, tmpCount);
//        }
//    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Collatz c = new Collatz();
        int ex = 939497;
        System.out.println("결 투더 과" + c.collatz(ex));
    }
}
