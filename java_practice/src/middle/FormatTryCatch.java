package middle;

public class FormatTryCatch {
    public static void main(String[] args) {
        String sNum="123";
        String nNum="h";

        try {
            int a = Integer.parseInt(sNum);
            System.out.println(a);
        } catch (NumberFormatException ee){
            System.out.println("int인지 확인 바람");
            System.out.println(ee.getMessage());
        } catch (Exception ee){
            System.out.println("값이 잘못 되었다.");
        } finally {
            System.out.println("무조건 수행해야한다.");
        }
    }
}

/*
문자열을 기본타입으로 변환할때는 랩퍼(wrapper)클래스 사용 -> 정수 Integer.parseInt(), 실수 Double.parseDouble()
예외처리는 예외를 안전하게 끝내느 것이 목적이므로 catch를 되도록 간단하게작성
finally는 예외의 발생 유무와는 상관없이 실행
 */
