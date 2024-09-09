package middle;

public class PrimMath {
    public static boolean isPrime(int n){
        boolean isS = true;
        for (int i =2 ; i <= (int)Math.sqrt(n) ; i++){
            if (n%i==0){
                isS=false;
                break;
            }
        }

        return isS;
    }

    public static void main(String[] args) {
        int number=1234567;
        boolean Ifprime = isPrime(number);
        if (Ifprime){
            System.out.printf("%d은 1과 자신으로만 나워떨어지는 소수다.",number);
        } else {
            System.out.printf("%d은 소수가 아니다",number);
        }
    }
}
