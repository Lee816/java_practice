package middle;

public class FruitMain {
    public static void main(String[] args) {
        FRUIT pear = FRUIT.APPLE;
        FRUIT pear2 = FRUIT.MANGO;

        System.out.println(pear);
        System.out.println(pear.name());
        System.out.println(pear.ordinal()); // enum에서 선언된 순서
        System.out.println(pear2.ordinal());
        FRUIT[] fruits = FRUIT.values();
        System.out.println(fruits[0]);
    }
}
