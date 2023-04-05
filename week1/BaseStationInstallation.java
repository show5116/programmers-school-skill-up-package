/**
 * N개의 아파트가 일렬로 쭉 늘어서 있습니다.
 * 이 중에서 일부 아파트 옥상에는 4g 기지국이 설치되어 있습니다.
 * 기술이 발전해 5g 수요가 높아져 4g 기지국을 5g 기지국으로 바꾸려 합니다.
 * 그런데 5g 기지국은 4g 기지국보다 전달 범위가 좁아, 4g 기지국을 5g 기지국으로 바꾸면 어떤 아파트에는 전파가 도달하지 않습니다.
 *
 * 예를 들어 11개의 아파트가 쭉 늘어서 있고,[4, 11]번째 아파트 옥상에는 4g 기지국이 설치되어 있습니다.
 * 만약 이 4g 기지국이 전파 도달 거리가 1인 5g 기지국으로 바뀔 경우 모든 아파트에 전파를 전달할 수 없습니다.
 *
 * 아파트의 개수 n
 * 기지국이 설치된 아파트 배열 stations
 * 전파의 도달 거리 w
 */
public class BaseStationInstallation {
    public static void main(String[] args) {
        solution(11, new int[] {4,11}, 1);
        solution(16, new int[] {9}, 2);
    }

    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int position = 1;
        int i = 0;

        while(position <= n){
            if(stations.length > i && position >= stations[i] - w){
                position = stations[i] + w + 1;
                i++;
            }else{
                position += w * 2 + 1;
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }
}
