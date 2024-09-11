package application.s114;

import java.util.Scanner;

public class OddMagicSquareMain {
    public static void main(String[] args) {
        System.out.println("홀수인 정수를 입력하세요.");
        Scanner scann = new Scanner(System.in);

        int n = scann.nextInt();

        OddMagicSquare odd = new OddMagicSquare(n);

        odd.make();
        odd.print();
    }
}
