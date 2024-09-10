package application.s104;

public class CardMain {
    public static void main(String[] args) {
        Card c1 = new Card("H4");
        Card c2 = new Card("H4");
        Card c3 = new Card(c1);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.getCardVal());
        System.out.println(c2.getCardVal());
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));

        for (int i=0 ; i < CardUtil.SUIT.length ; i++){
            for (int j=0 ; j < CardUtil.VALU.length ; j++){
                Card c = new Card();
                System.out.printf("%s\t",c);
            }
            System.out.println();
        }
    }
}

/*
static 은 객체를 생성하지 않고 사용하기 위해 만든 키워드이다.
static이 붙은 메서드나 변수는 '클래스이름.메서드' 나 '클래스이름.변수' 처럼 사용한다.
 */
