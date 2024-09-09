package middle;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ForCondition3 {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        int s =0 ;
        for (int i=1 ; i <= 100 ; i++){
            ilist.add(i);
        }

        s = ilist.stream().reduce(0,Integer::sum);
        System.out.println("1~100의 합 : "+s);

        s=0;
        s = ilist.stream().filter(i -> i%2==1).reduce(0, Integer::sum);
        System.out.println("1~100 사이의 홀수의 합 : " + s);

        s = ilist.stream().filter(i -> i%2==1).reduce(0, (x,y)->x+y);
        System.out.println("1~100사이의 홀수의 합 : "+s);

        s = ilist.stream().filter(i -> i%2==1).reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t, Integer u) {
                return t+u;
            }
        });
        System.out.println("1~100 사이의 홀수의 합 : "+s);
    }
}
/*
stream은 '순차적으로 나열된 데이터'이다. stream은 저장된 데이터를 쉽고 편하게 연산(filter, map, reduce)할수 있는 기능을 제공한다.
filter는 조건에 맞는 것을 찾을때 사용한다.
reduce는 간편하게 합을 구할때 사용한다 reduce(초기값, Inteer:sum) 초기값 부터 모든 수의 총합을 구한다.
 */
