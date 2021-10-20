package DataType;

public class DataType04 {
	
	public static void main(String[] args) {
		
	
	//Q01] 변수 2개, 숫자 대입, 더하기 연산, 연산과정과 결과를 출력하세요.
	//10 + 20 = 30
	
	int a = 10;
	int b = 20;
	
	System.out.println(a + b); //30
	
	
	//변수나 식별자가 "" 안에 들어가면 평볌한 *문자열*이 된다.
	// 1 + 2 + 3 + 4 + 5 :  왼쪽---> 오른쪽 
	System.out.println("a" + "+" + "b" + "=" + a + b);		//1020
	System.out.println("a" + "+" + "b" + "=" + (a + b));	//30
	
	//--------------------------------------------------------------------------
	
	//주민등록번호
	//9505142014789
	//0105142014789
	
	//자바에서의 기수법
	//- 출력할때는 무조건 10진수로 출력된다.
	//1. 10진법
	//2. 2진법
	//3. 8진법
	//4. 16진법
	

	//앞자리 표현
	int jumin = 950514; //10진수
	System.out.println("주민번호: " + jumin);
	
	jumin = 010514; //8진수, 4428
	System.out.println("주민번호: " + jumin);
	
	jumin = 0x10;
	System.out.println(jumin);
	
	//*** 숫자형태를 가지는 데이터를 취급할 때 주의점!!
	//- 해당 데이터를 산술 연산을 할것인가?? o(숫자), x(문자열)
	//1. 나이 > 숫자형(int) > o
	//2. 주민등록번호 > 숫자형(x) > 문자열(o)
	//3. 전화번호 > 문자열(o)
	
	int age = 20;
	String jumin2 = "051201";
	System.out.println(jumin2);
	
	//변수 사용시
	// - 변수는 값이 초기화되지 않으면(값을 가지고 있지 않으면) 사용이 불가능하다!
	int num; //생성 직후 상태 -> null 상태, null값을 가진다.
	
	//System.out.println(num);
	// - Error : The local variable num may not have been initialized
	// 			 =지역 변수는 null상태로 사용이 불가능 하다.
	
	
	}//main


}
