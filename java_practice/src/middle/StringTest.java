package middle;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String text=" Hello Java4Android";
        String com=" HEllo Java4Android";

        System.out.println(text.charAt(2)); // 2번 인덱스의 문자를 반환
        System.out.println(text.concat("s")); // concat()는 + 와 같으므로 오른쪽 끝에 문자열을 붙여준다
        System.out.println(text.contains("And")); // 해당 문자열을 포함하고 있는지 판별한다.
        System.out.println(text.equals(com)); // 두 문자열이 같은지 판별한다.
        System.out.println(text.equalsIgnoreCase(com)); // 대소문자를 구별하지 앟고 같은지 판별한다.
        System.out.println(text.indexOf('a')); // 문자열(또는문자)이 처음 발견된 위치를 반환하며 없으면 -1 을 반환
        System.out.println(text.lastIndexOf('a')); // 마지막 위치를 반환하며 없으면 -1 반환
        System.out.println(text.trim()); // 양쪽의 공백을 제거
        System.out.println(text.length());// 공백을 포함한 문자열의 길이를 반환
        System.out.println(text.substring(7));// 해당 인덱스의 앞쪽은 자르고 그 위치부터 이후를 반환
        System.out.println(text.substring(7,11)); // 앞의 인덱스 위치부터 뒤의 수만큰의 글자수를 반환
        System.out.println(text.replace("","_")); // 처음으로 만나는 왼쪽의 값을 오른쪽의 값으로 변경
        System.out.println(text.replaceAll("","-")); // 모든 왼쪽의 값을 오른쪽의 값으로 변경
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String[] sp=text.split(" "); // 해당 문자를 기준으로 문자열을 발라 배열로 반환
        System.out.println(Arrays.stream(sp).toList());
        for (int i=0 ; i < sp.length ; i++){
            System.out.println(i+"\t\t"+sp[i]+"\t\t"+sp[i].length());
        }
    }
}
