package application.s103;

public class Card {
    private String cardVal;

    public String getCardVal(){
        return cardVal;
    }

    // 기본 생성자 - 멤버 초기화
    public Card(){
        this.cardVal=("H2");
    }

    //테스트용
    public Card(String s){
        this.cardVal=s;
    }

    //복사 생성자
    public Card(Card c){
        this.cardVal = c.getCardVal();
    }

    @Override
    public String toString(){
        return "["+cardVal+"]";
    }
}
