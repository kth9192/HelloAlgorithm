package helloworld;

import java.util.ArrayList;


/**
 * Created by kth919 on 2017-08-10.
 */
/*
야근 지수 = 잔업량 ^ 2
한시간동안 남은 일중 하나를 골라 1의 작업량을 처리할 수 있음

 */
public class NoOvertime {

//    public int noOvertime(int no, int[] works) {
//        int result = 0;
//
//        while (no>0){
//            Arrays.sort(works);
//            works[works.length - 1] -= 1;
//            no--;
//        }
//
//        for (int i = 0; i<works.length; i++) {
//            result += Math.pow(works[i], 2);
//        }
//
//        return result;
//    }

    public int noOvertime(int no, int[] works) {

        int result = 0;
        int tmpMax;
        ArrayList<Integer> tmpList = new ArrayList();

        for (int i = 0; i<works.length; i++){
            tmpList.add(works[i]);
        }

        while (no > 0){
            tmpMax = tmpList.get(tmpList.size()-1);

            for (int i = 0; i<works.length; i++){
                tmpMax = Math.max(tmpMax, tmpList.get(i));
            }

            tmpList.set(tmpList.indexOf(tmpMax), tmpList.get(tmpList.indexOf(tmpMax)) - 1) ;
            no--;
        }

        for (int i = 0; i<works.length; i++){
            result += Math.pow(tmpList.get(i) , 2);
        }

        return result;
    }

        public static void main(String[] args) {
        NoOvertime c = new NoOvertime();
        int []test = {4,3,3};
        System.out.println(c.noOvertime(5,test));
    }
}
