import java.util.Arrays;

/**
 * 자전거 공장을 운영 중인 명수는 최근에 공장의 시설을 모두 자동화하였습니다.
 * 자동화 덕분에 인건비는 줄었지만 기계들의 전기 소모량이 매우 많아져서 전기요금이 늘어나게 되었습니다.
 * 자전거를 한 대를 만드는데 필요한 전기는 1kW이며, 생산 시간은 0초입니다.
 *
 * 명수는 전기요금을 최대한 줄이고 싶습니다. 전기요금은 한 달 단위로 누진제가 적용됩니다.
 * 누진제는 전기 사용량이 일정 수준 이상이 되면 전기요금의 단가를 높이는 것을 의미합니다.
 * 예를 들어, 기본 전기요금이 1kW당 100원이고, 100kW 초과 사용한 전기 요금에는 1kW당 150원이 부과 될 때,
 * 150kW를 사용했을 때의 전기요금은 100kW에 대해서는 10,000원, 50kW에 대해서는 7,500원이 부과되어서 17,500원이 됩니다.
 * 
 * 전기요금의 누진제 정보를 나타내는 2차원 배열 cost와 자전거 생산 예약 정보를 나타내는 2차원 배열 order가 주어졌을 때,
 * 명수가 자전거를 생산하기 위해 필요한 최소한의 전기요금을 return 하는 solution 함수를 완성하시요
 */
public class BicycleFactory {
    public static void main(String[] args) {
        solution(new int[][] {{0,10},{50,20},{100,30},{200,40}}, new int[][] {{3,50},{7,200},{8,200}});
    }

    public static int solution(int[][] cost, int[][] order) {
        int answer = 0;

        Arrays.sort(order, (o1, o2) -> o1[0] - o2[0]);

        int[][] totalOrder = new int[order.length][2];

        for(int i = 0;i < order.length; i++) {

        }

        return answer;
    }
}
