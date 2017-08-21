package helloworld;

/**
 * Created by kth919 on 2017-08-04.
 */
/*
2016년은 2월이 29일
1- 31
2 - 29
3- 31
4- 30
5- 31
6-30
7-31
8-31
9-30
10-31
11-30
12-31

1. 월판단후 월에 해당 일수 판별
2. 1월 1일부터 7일 마다 금요일 이므로 7a + b 의 공식으로 요일이 정해짐.
b의 수에 따라 요일 판별 ex) b = 0 금요일 , b =1 토요일 , b = 2 일요일
 */
public class TryDayName {

    public String getDayName(int a, int b)
    {
        String answer = "";
        int tmp = 0;
        int[] daysEachMonth = getCalendar2016();

         for (int i = 0; i<a-1; i++){
             tmp += daysEachMonth[i];
         }

         tmp += b;
        switch(tmp%7){
                case 1:
                    answer = "FRI";
                    break ;
                case 2:
                    answer = "SAT";
                    break ;
                case 3:
                    answer = "SUN";
                    break ;
                case 4:
                    answer = "MON";
                    break ;
                case 5:
                    answer = "TUE";
                    break ;
                case 6:
                    answer = "WED";
                    break ;
                case 0:
                    answer = "THU";
                    break ;
            }

        return answer;
    }

    public int[] getCalendar2016(){

        int[] daysEachMonth = new int[12];

        for (int i = 0; i<12; i++){
            if (i+1 == 1 || i +1 == 3 || i+1 == 5
                    || i +1 == 7 || i +1 == 8
                    || i +1 == 10 || i +1 == 12){
                daysEachMonth[i] = 31;
            }else if (i + 1 == 2){
                daysEachMonth[i] = 29;
            } else {
                daysEachMonth[i] = 30;
            }
        }
        return daysEachMonth;
    }

    public static void main(String[] args)
    {
        TryDayName test = new TryDayName();
        int a=1, b=1;
        System.out.println(test.getDayName(a,b));
    }
}
