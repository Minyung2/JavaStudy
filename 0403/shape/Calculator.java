package jun.shape;

public class Calculator {
//	2. 다음 코드에서, 메소드 오버로딩을 이용하여 int 형 변수 a와 b를 더한 값을 반환하는
//	 add 메소드를 만들어보세요. add 메소드는 두 개의 int 형 파라미터를 받습니다.

	public int add(int a) {
	   return a;
	}

	public int add(int a, int b) {
	   return a + b;
	}

	public static void main(String[] args) {
	   Calculator cal = new Calculator();
	   System.out.println(cal.add(3)); // 3 출력
	   System.out.println(cal.add(3, 5)); // 8 출력
	}
}
