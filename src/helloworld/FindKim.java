package helloworld;

/**
 * Created by kth919 on 2017-07-31.
 */
/*
1. 배열 받기
2. 배열 길이체크
3. 배열을 순서대로 탐색
4. 배열 탐색 도중 김서방을 찾으면 위치 반환
* */
public class FindKim {
    public String findKim(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = 0;

        for(int i = 0; i<seoul.length; i++){

            if (seoul[i].equals("Kim")){
                x = i;
            }

        }

        return "김서방은 "+ x + "에 있다";
    }

    // 실행을 위한 테스트코드입니다.
    public static void main(String[] args) {
        FindKim kim = new FindKim();
        String[] names = {"Queen", "Tod","Kim"};
        System.out.println(kim.findKim(names));
    }
}
