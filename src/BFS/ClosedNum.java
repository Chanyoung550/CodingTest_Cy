package BFS;

/*
	문제설명 
	정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ array의 길이 ≤ 100
	1 ≤ array의 원소 ≤ 100
	1 ≤ n ≤ 100
	가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.

	입출력 예
	array			n		result
	[3, 10, 28]		20		28
	[10, 11, 12]	13		12

*/
public class ClosedNum {
	public static void main(String[] args) {
		Solution6 sl = new Solution6();
		int[] num = {3, 10, 28};
		int num2 = 20;
		System.out.println(sl.solution(num, num2));
	}
}
class Solution6 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
        	if(answer == 0) {
        		answer = array[i];
        	}
        	else {
        		if(Math.abs(n - answer) > Math.abs(n - array[i])) {
        			answer = array[i];
        		}
        		else if(Math.abs(n - answer) == Math.abs(n - array[i])) {
        			if(answer > array[i]) {
        				answer = array[i];
        			}
        		}
        	}
        }
        return answer;
    }
}