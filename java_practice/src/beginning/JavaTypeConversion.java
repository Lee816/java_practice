package beginning;

public class JavaTypeConversion {
    public static void main(String[] args) {
        String slat = "37.52127220511242   ";
        // String slat = "hello";
        // 공백 제거 후 double로 타입 변환
        double latitude = Double.parseDouble(slat.trim());
        // trim() 으로 양쪽 공백을 제거
        // Double 랩터 클래스를 이용하여 타입 변환
        System.out.println(latitude);
    }
}
