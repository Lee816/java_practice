package application.s107;

import java.util.Comparator;

public class CardComp implements Comparator<Card> { // compataror를 이용하지만 card에 한정하고 싶어서 card로 포맺팅
    @Override
    public int compare(Card c1, Card c2){
        if (c1.getCardVal().charAt(0) > c2.getCardVal().charAt(0)) {
            return 1;
        } else if (c1.getCardVal().charAt(0)<c2.getCardVal().charAt(0)){
            return -1;
        } else {
            if (CardUtil.toVal(c1.getCardVal().charAt(1))>CardUtil.toVal(c2.getCardVal().charAt(1))){
                return 1;
            } else if (CardUtil.toVal(c1.getCardVal().charAt(1)) < CardUtil.toVal(c2.getCardVal().charAt(1))){
                return -1;
            } else return 0;
        }
    }

}
