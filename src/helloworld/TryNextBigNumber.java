package helloworld;


/**
 * Created by kth919 on 2017-08-07.
 */
/*
일반적으로 이진수의 다음 큰수는 가장 작은 단위위치에 (가장 오른쪽에) 1을 더하는 것으로 만들수 있다.
 하지만 이는 반드시 1의 개수의 변화가 생기는 방법이다.(끝이 0이면 1이 추가. 1이면 위로 올리면서 덧셈)
 1의 개수를 유지하면서 바로 다음 큰 수를 구하려면 시프트 연산이 최선이다.
  이진수를 시프트하는 것만 가지고 숫자의 크기를 키우려면 0이 최초로 나타나는 지점(1의 자리 제외) 으로 1을 끌어올리고
 나머지는 다 오른쪽 끝으로 밀어버린다.
1. 자연수를 이진수로 치환한다. (최대 한도 자리수 만큼 이진수 자리 확보)
2. 이진수 1의 개수를 센다.
3. 밑에서 위로 이진수를 조사하면서 0이 최초로 등장할때 1하나를 끌어올린다. (지점 저장)
4. 나머지 1을 밑으로 내린다.
 */
public class TryNextBigNumber {

    public int nextBigNumber(int n)
    {
        int answer = 0;
        int index = 0;
        int count = 0;

        String tmpBinary = Integer.toBinaryString(n);
        int[] tmpArr = new int[tmpBinary.length() + 1];
        boolean meetOne = false;

        for (int i = tmpBinary.length()-1; i>=0; i--){
            tmpArr[tmpBinary.length() -1 - i] = tmpBinary.charAt(i) - 48;
        }

        while (index < tmpArr.length){

            if (index != 0 && tmpArr[index] == 0 && meetOne){

                tmpArr[index] = 1;
                count --;

                for (int j = 0; j<index; j++){
                    if (count != 0) {
                        tmpArr[j] = 1;
                        count--;
                    } else {
                        tmpArr[j] = 0;
                    }
                }
                break;

            } else if (tmpArr[index] == 1) {
                if (count == 0) {meetOne = true;}
                count++;
            }

            index++;
        }

        for (int i = 0; i<tmpArr.length; i++){
            answer += tmpArr[i] * Math.pow(2, i);
        }

        return answer;
    }

    public static void main(String[] args)
    {
        TryNextBigNumber test = new TryNextBigNumber();
        int n = 395240;
        System.out.println("결과" +test.nextBigNumber(n));
    }
}
