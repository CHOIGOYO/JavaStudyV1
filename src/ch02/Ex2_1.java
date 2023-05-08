package ch02;

public class Ex2_1 {
    public static void main(String[] args) {
        System.out.println("Hello"); //  println - 줄바꿈 O
        System.out.println("Hello");
        System.out.println("Hello");

        System.out.print("Hello"); // print - 줄바꿈 X
        System.out.print("Hello");
        System.out.print("Hello");

        System.out.println("");
        /* "" 안의 내용은 모두 문자열로 인식함 */
        System.out.println("덧셈 뺄겜 계산하기");
        System.out.println("3+5 = "+(3+5));
        System.out.println("3-5 = "+(3-5));
        System.out.println("3x5 = "+(3*5));
        System.out.println("10÷5 = "+(10/5));

    }
}
