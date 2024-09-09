package middle;

public class UsingObject {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1.hashCode()); // native 10진수
        System.out.println(Integer.toHexString(obj1.hashCode())); // 16진수
        System.out.println(obj1==obj2); // 스택영역의 레퍼런스를 비교 new키워드로 새엉하는 참조타입의 레퍼런스는 객체마다 고유하므로 항상 flase
        System.out.println(obj1.equals(obj2)); // 1차주소(해시코드)를 비교한다.
        System.out.println(obj1);
        System.out.println(obj2.toString());

        System.out.println(obj1.getClass().getName()); // 클래스 이름
        String str=obj1.getClass().getName() + "@" + Integer.toHexString(obj1.hashCode());
        System.out.println(str);

        Object objstr= new String("Good");
        System.out.println(objstr.toString());
        System.out.println(objstr instanceof Object);
        System.out.println(objstr instanceof String);

        String hello="hello";
        System.out.println(hello.getClass());
    }
}
/*
자바에서 최상위 클래스는 Object이며, JVM의 메서드를 이용하여 메모리를 관리한다. ( 메모리는 자동관리 된다)
Object데 대한 객체가 생성되면 JVM이 구별하는 해시코드와 사용자가 구별할 수 있는 레퍼런스도 준비된다.
Object 클래스가 스태틱영역에 올라가고, 객체는 힙 영역에 생성되며, 레퍼선스는 스택 영역에 있게 된다.
객체를 두개 생성하면 클래스 하나와 객체 두개, 각 객체에 대한 고유 레퍼런스와 해시코드가 생성된다.

 */
