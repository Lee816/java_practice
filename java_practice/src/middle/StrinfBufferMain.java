package middle;

public class StrinfBufferMain {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();

        // 1계속 붙이는 함수 mutable
        sb1.append("안녀아세요").append("또 만나요.").append("모두를 사랑해요. 기다려봐.");
        System.out.println(sb1.toString()+sb1.hashCode());

        // 2 replace
        sb1.replace(0,2,"나 보기가 역겨워");
        System.out.println(sb1.toString()+sb1.hashCode());

        // 3 reverse
        sb1.reverse();
        System.out.println(sb1.toString());

        // 4 delete
        sb1.delete(10,15);
        System.out.println(sb1.toString());

        // 5 cal by reference, shallow copy
        replaces(sb1);
        System.out.println(sb1.toString());
    }

    public static void replaces(StringBuffer sb){
        sb.reverse();
        sb.replace(0,3,"GoGo");
    }
}
/*
문자열은 변경이 되면 그 값에 대한 새로운 주소를 갇는다.
StringBuffer는 저장하는 내용이 변경되어도 처음 주소가 변경되지 않는다.

바꾼 문자열을 다시 대입하지 않으면 원래 문자열이 되는 특징이 이뮤터블이고, 바꾼 문자열을 다시 대입하지 않아도 원래 문자열이 변하는 것을 뮤터블이라고한다.
즉 String은 이뮤터블, StringBuffer는 뮤터블이다.
 */