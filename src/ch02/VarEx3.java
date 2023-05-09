package ch02;

public class VarEx3 {
    public static void main(String[] args) {
        // 변수
        int score = 100;
        score = 200;
        System.out.println(score);
        // 상수
        final int f =  200;
        /*
        * Error msg : Cannot assign a value to final variable 'f'
        * */
//        f = 100;     // => 에러

    }
}
