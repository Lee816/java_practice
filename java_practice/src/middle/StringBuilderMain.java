package middle;

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder sbu=new StringBuilder();
        sbu.append("I").append(" go").append(" to school.");
        System.out.println(sbu);

        sbu.replace(7,11,"");
        System.out.println(sbu);

        sbu.reverse();
        System.out.println(sbu);

        sbu.deleteCharAt(3);
        System.out.println(sbu);

        sbu.delete(1,3);
        System.out.println(sbu);

        String ss=sbu.substring(0);
        System.out.println(ss);
        System.out.println(sbu);

        String st=sbu.substring(0,4);
        System.out.println(st);
        System.out.println(sbu);
    }
}
/*
문자열은 내용이 조금이라도 바뀌거나 추가되면 새로운 객체를 만든다.
레퍼런스를 잃어버린 객체는 가비지 컬렉셔의 대상이 되며, 새로운 객체에게 새 주소를 주므로 해시코드도 변한다.

StringBuilder는 원래 있던 객체의 내용만 바뀌는(주소는 변경하지 않음) 뮤터블한 특성이 있기 때문에 StringBuffer를 쓰도록 권장한다.

 */