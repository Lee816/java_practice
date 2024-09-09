package middle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForLambdaCondition {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        int s= 0;
        for (int i=1 ; i <= 10 ; i++){
            ilist.add(i);
        }

        ilist=ilist.stream().filter(i -> i%2==1).map(i -> i*i).collect(Collectors.toList());
        // 필터롤 통해 찾은 수에 대해서 map안에 있는 수행문을 처리해라
        // map 처리된 수를 새로운 리스트로 저장해라 ( collect )

        ilist.forEach(i->{
            System.out.printf(i+"\t");
        });
        System.out.println();

        s=ilist.stream().reduce(0, Integer::sum);
        System.out.println("1~10사이의 홀수에 대한 제곱 합 : " + s);
    }
}
