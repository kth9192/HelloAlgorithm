package helloworld;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kth919 on 2017-08-14.
 */
public class BuildAirport {

//    public int chooseCity(int n, int [][]city)
//    {
//        int answer = 0;
//        int[] tmpAnswer = new int[city.length];
//        int tmp = 0;
//        int index = 0;
//
//        for (int i = 0; i<n; i++){
//            for (int j = 0; j<n; j++){
//                if (j != i){
//                    tmpAnswer[city[i][0]-1] += Math.abs(city[i][0] - city[j][0])*city[j][1];
//                    System.out.println("기준" + i + " : "  + "비교위치" + j + " : " +  tmpAnswer[city[i][0]-1]);
//                }
//            }
//
//            if (i > 0) {
//                tmp = Math.min(tmpAnswer[city[i][0] - 1], tmpAnswer[city[i-1][0]]-1);
//                if (tmpAnswer[city[i][0] - 1] < tmpAnswer[city[i-1][0]]-1){
//
//                }
//            }
//        }
//
//        while (index < city.length){
//            if (tmp == tmpAnswer[city[index][0]-1]){
//                answer = city[index][0]-1;
//                break;
//            }
//            index++;
//        }
//
//        return answer+1;
//    }

    public int chooseCity(int n, int [][]city){

        int answer = 0;
        Map<Integer, Integer> tmpMap = new HashMap<Integer, Integer>();
        int tmp = Integer.MAX_VALUE;

        for (int i = 0; i<n; i++){
            tmpMap.put(city[i][0], 0);

            for (int j = 0; j<n; j++) {
                if (i !=j) {
                    tmpMap.put(city[i][0], tmpMap.get(city[i][0]) + (Math.abs(city[i][0] - city[j][0]) * city[j][1]));
                }
            }

            if (tmp > tmpMap.get(city[i][0])){
                tmp = tmpMap.get(city[i][0]);
                answer = city[i][0];
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        BuildAirport test = new BuildAirport();
        int tn = 3;
        int [][]tcity = {{1,5},{2,2},{3,3}};
        System.out.println(test.chooseCity(tn,tcity));
    }

}
