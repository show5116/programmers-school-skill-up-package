import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 *
 * 예를들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고,
 * 이중 가장 큰 수는 6210입니다.
 *
 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때,
 * 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return하도록 solution 함수를 작성해주세요.
 */
public class LargestNumber {
    public static void main(String[] args) {
        solution(new int[]{6,10,2});
        solution(new int[]{3,30,34,5,9});
    }

    public static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<String> queue = new PriorityQueue<String>(new MyComparator());
        for(int number : numbers){
            queue.add(number+"");
        }

        int size = queue.size();

        for(int i=0; i<size;i++){
            sb.append(queue.poll());
        }

        return sb.toString();
    }

    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return (o2+o1).compareTo(o1+o2);
        }
    }
}
