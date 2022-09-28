package code01;

import java.util.LinkedList;
import java.util.Queue;

//		문제 설명
//		괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
//		
//		"()()" 또는 "(())()" 는 올바른 괄호입니다.
//		")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
//		'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
//		
//		제한사항
//		문자열 s의 길이 : 100,000 이하의 자연수
//		문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
//		입출력 예
//		s			answer
//		"()()"		true
//		"(())()"	true
//		")()("		false
//		"(()("		false
//		입출력 예 설명
//		입출력 예 #1,2,3,4
//		문제의 예시와 같습니다.


public class StackQueue01 {
	
	public static void main(String[] args) {
		
		Solution2 sl = new Solution2();
		
		boolean b = sl.solution("()()");
		
		System.out.println(b);
		
	}

}

class Solution2 {
    boolean solution(String s) {
		boolean answer = true;
		int cnt = 0;
		int lcnt = 0;
		int rcnt = 0;
    	if(s.length() < 100000) {
    		Queue<String> q = new LinkedList<String>();
            
            for( int i = 0; i < s.length(); i++) {
            	q.offer(String.valueOf(s.charAt(i)));
            }
            System.out.println("queue Size : " + q.size());
            
            while(cnt < q.size()) {
            	if( cnt == 0) {
                	System.out.println("cnt : " + cnt);
            		if(q.poll() == ")") {
            			System.out.println("박현주 ");
            			answer = false;
            		}
            	}
            	else if( cnt == q.size()-1) {
            		if(q.poll() == "(") {
            			System.out.println("바보 ");
            			answer = false;
            		}
            	}
            	else {
            		if(q.poll() == "(") {
            			System.out.println("l");
            			lcnt++;
            		}
            		else {
            			System.out.println("r");
            			rcnt++;
            		}
            	}
            	System.out.println("lcnt : " + lcnt);
            	System.out.println("rcnt : " + rcnt);
            	cnt++;
            }
            
            if(answer == true) {
            	if(lcnt != rcnt) {
            		System.out.println("last");
            		answer = false;
            	}
            }
    	}
        return answer;
    }
}