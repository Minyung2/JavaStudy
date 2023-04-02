package jun.review;

import java.util.ArrayList;

public class Example {
	public static void main(String[] args) {
		// String 타입을 요소로 갖는 ArrayList 생성
		ArrayList<String> strArray = new ArrayList<>();
		// add 메소드를 이용하여 요소 추가
		strArray.add("자바");
		strArray.add("코딩");
		strArray.add("파이썬");
		// get 메소드를 이용하여 요소 접근
		System.out.println("<get>");
		System.out.println(strArray.get(0));
		// set 메소드를 이용하여 요소 수정
		System.out.println("<set>");
		strArray.set(0, "버리고 자바 스크립트");
		System.out.println(strArray.get(0));
		// size 메소드를 이용하여 리스트 크기 확인
		System.out.println("<size>");
		System.out.println(strArray.size());
		// contains 메소드를 이용하여 요소 존재 여부 확인
		System.out.println("<contains>");
		System.out.println(strArray.contains("자바"));
		System.out.println(strArray.contains("버리고 자바 스크립트"));
		// remove 메소드를 이용하여 요소 삭제
		System.out.println("<remove>");
		System.out.println(strArray.remove(0));
		// Enhanced for문을 이용하여 리스트 요소 출력
		System.out.println("<Enhanced for>");
		for(String a : strArray) {
			System.out.println(a);
		}
		System.out.println("<forEach>");
		strArray.forEach(str -> System.out.println(str));
	}
}
