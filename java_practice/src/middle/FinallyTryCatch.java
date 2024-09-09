package middle;

public class FinallyTryCatch {
    public static void main(String[] args) {
        try {
            int x= 5;
            int y= 20/(5-x);
            System.out.println(y);
        } catch (ArithmeticException e){
            System.out.println("==> 0으로 나눴나 보네요");
        }finally {
            System.out.println("무조건 수행");
        }
    }
}
