import java.util.Arrays;

/**
 * 국가의 역할 중 하나는 여러 지방의 예산요청을 심사하여 국가의 예산을 분배하는 것입니다.
 * 국가예산의 총액은 미리 정해져 있어서 모든 예산요청을 배정해 주기는 어려울 수도 있습니다.
 *
 * 그래서 정해진 총액 이하에서 가능한 한 최대의 총 예산을 다음과 같은 방법으로 배정합니다.
 *
 * 1. 모든 요청이 배정될 수 있는 경우에는 요청한 금액을 그대로 배정합니다.
 * 2. 모든 요청이 배정될 수 없는 경우에는 특정한 상한액을 계산하여
 * 그 이상인 예산요청에는 모두 상한액을 배정합니다.
 * 상한액 이하의 예산요청에 대해서는 요청한 금액을 그대로 배정합니다.
 *
 * 예를 들어, 전체 국가예산이 485이고 4개 지방의 예산요청이 각각 120, 110, 140, 150일 때,
 * 상한액을 127로 잡으면 위의 요청들에 대해서 각각 120, 110, 127, 127을 배정하고 그 합이 484로 가능한 최대가 됩니다.
 * budgets과 총 예산 M이 매개변수로 주어질 때, 위의 조건을 모두 만족하는 상한액을 return 하도록 solution 함수를 작성해주세요.
 */
public class Budget {
    public static void main(String[] args) {
        solution(new int[]{120, 110, 140, 150}, 485);
    }

    public static int solution(int[] budgets, int M) {
        int answer = 0;
        long sum = 0;
        Arrays.sort(budgets);
        for(int b : budgets){
            sum += b;
        }
        int n = budgets.length;
        if(sum < M) {
            answer = budgets[n - 1];
        }else{
            sum = 0;
            int left = 0; // 수정
            int right = budgets[n - 1];


            while(left <= right){
                int mid = (left + right) / 2;
                sum = 0;
                for(int i=0; i<n; i++){
                    if(budgets[i] < mid)
                        sum += budgets[i];
                    else
                        sum += mid;
                }
                if(sum > M){
                    right = mid-1;
                }
                else{
                    left = mid +1;
                    answer = mid;
                }
            }
        }

        return answer;
    }
}
