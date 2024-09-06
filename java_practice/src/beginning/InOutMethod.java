package beginning;

import java.util.Scanner;

public class InOutMethod {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int choice = scann.nextInt(); // 키보드로 정수 입력
        System.out.println(choice);

        System.out.println("실수를 입력하세요");
        double rchoice = scann.nextDouble(); // 키보드로 실수 입력
        System.out.println(rchoice);

        System.out.println("문자열을 입려가세요");
        String schoice = scann.next(); // 키보드로 문자열 입력
        System.out.println(schoice);
    }
}
