package middle;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLambdaLotto {
    public static void main(String[] args) {
        List<Integer> mmlists = Arrays.asList(1,6,16,22,23,33); // 여러 수를 list에 저장하는데 저장할 수가 int타입일때 랩퍼 클래스 integer를 사용
        mmlists.forEach(
                m -> {
                    System.out.printf(m+"\t");
                }
        ); // 여기서 m이 사용할 변수 선언한것이고 중괄호 안에 실행문을 작성하는 형태로 이해함
        System.out.println();
        Consumer<Integer> consume = (Integer m) -> {
            System.out.printf(m+"\t");
        };
        mmlists.forEach(consume);
    }
}
/*
 foreach문과 비슷한 형태로 인덱스 ㅇ벗이 순서대로 수를 가져온 다음 -> {} (람다) 형식을 이용해서 그 수를 처리한다.
 foreach문에서 순서대로 수를 가져와 출력하려면 foreach( m -> { m 출력 }) 형식을 이용한다.
 */
