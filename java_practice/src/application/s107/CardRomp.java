package application.s107;

import java.util.Comparator;

public class CardRomp implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2){
        if (c1.getCardVal().charAt(0) > c2.getCardVal().charAt(0)) {
            return -1;
        } else if (c1.getCardVal().charAt(0)<c2.getCardVal().charAt(0)){
            return 1;
        } else {
            if (CardUtil.toVal(c1.getCardVal().charAt(1))>CardUtil.toVal(c2.getCardVal().charAt(1))){
                return -1;
            } else if (CardUtil.toVal(c1.getCardVal().charAt(1)) < CardUtil.toVal(c2.getCardVal().charAt(1))){
                return 1;
            } else return 0;
        }
    }
}

// CardComp와 같은 정렬하는 역할이지만 역순으로 정렬