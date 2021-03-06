package DataType;

public class dataType02 {
	
	public static void main(String[] args) {
		
		// 자료형 ----적용----> 변수
		
		//[변수, Variable]
		// - 메모리상의 사용자가 할당받은 공간
		// - 데이터를 저장하는 상자(= 공간)
		
		
		//1. 성적처리
		
		//1) 국어 점수 조작(예측)
		//2) 국어 점수 저장 할 공간 확보(예측)
		//3) 국어 점수 성질 -> 형태 + 길이 -> 정의 -> 정수(형태) + 0~100점 = 길이?!
		//4) 예측 결과가 가장 적합한 자바의 자료형을 선택
		//5) byte형 선택
		//6) 명령어 > 메모리 > byte 자료형의 공간을 얻어오기 > 변수 생성하기
		
		//----------------------------------------------------------------
		
		//2. 변수 생성하기, 변수 선언하기
		// - 자료형 변수명;
		// - ';' 문장의 끝을 표현한다. (명령어 1개) 마침표. 문장 종결자
		// - 변수 -> 데이터를 저장하는 공간
		// - 변수 -> 메모리의 특정 주솟값을 대신하는 표현 -> 공간접근 -> 공간
		byte kor; //시험 점수가 0~100에 형성되므로 byte(-128 ~ +127) 선택
		double pi;
		
		//----------------------------------------------------------------
		
		//3. 데이터 대입하기, 변수 초기화하기
		// - 변수 = 데이터;
		// - '=' : 대입 연산자(할당 연산자). 우측의 데이터를 좌측의 공간에 넣어라
		kor = 90;
		pi = 3.14;
		
		//----------------------------------------------------------------
		
		//4. 변수 사용하기, 데이터 읽기
		System.out.println(kor); 
		System.out.println(pi);
		//변수를 찍어라						(X)
		//변수를 찾아가서 *그 안의 데이터*를 찍어라 (O)
		
		//================================================================
		
		/*
		 
		 [변수 VS 상수]
		   - 변수 : 변하는 수
		   - 상수 : 변하지 않는 수
		   - 기준 : 표현에 따라 값의 상태를 보고 판단
		   
		   
		   1. 상수의 의미
		   	1) 데이터 표현 > 리터럴(Literal)
		   		-100
		   	
		   	2) 이름이 있는 상수
		   		- final score = 100;
		   		
		   	=> 변수 : 공간 의미 + 저장된 데이터에 식별이 가능한 의미 부여 역할(이름 붙이기)****
		   	   상수 : 데이터 자체
		   	   
		 
		 */
		//EX01] 과학점수 80점을 화면에 출력하시오.
		
		//Case 1. 더 좋은 방법
		byte sci;
		sci = 100;
		System.out.println(sci); //무엇을 출력? sci출력 => sci의 의미는?
		
		//Case 2. 비추천
		System.out.println(100); //무엇을 출력? 100을 출력 => 100의 의미는?
		
		//================================================================
		
		//[변수의 이용]
		byte a;
		a = 123;
		System.out.println(a); //123
		
		//******
		//덮어쓰기
		//변수는 1개당 데이터를 1개'만' 저장 할 수 있다.
		//변수 치환
		a = 10;
		
		System.out.println(a); //***10
		
		//의미 없음
		System.out.println(486); //123
		
		//================================================================

		//[final 변수]
		// = 이름이 있는 의미있는 상수
		// = 한번 값을 초기화하면 더이상 변경을 할 수 없는 변수
		final byte score = 100;
		//score = 90; 
		//에러 메시지 : The final local variable score cannot be assigned. 
		//			  It must be blank and not using a compound assignment
		
		System.out.println(score); //100
		
		//================================================================
		
		//[변수 선언과 초기화]
		
		byte a1; 		//선언문
		a1 = 10; 		//초기화

		byte b2 = 20;	//선언 + 초기화
		
		byte b3;
		byte b4;
		byte b5;
		
		byte b6, b7, b8;
		
		byte b9 = 10, b10 = 11, b11 = 12;
		
		byte b12 = 13, b13, b14;
		
		
		// 국어, 수학, 영어 점수
		// 자바는 문장을 ';'로 구분한다.
		
		byte kor1;		//국어
		byte math1;		//수학
		byte eng1;		//영어
		
		kor1 = 80;
		math1 = 100;
		eng1 = 90;
		
		byte kor2 = 100;	//국어
		byte math2 = 70;	//수학
		byte eng = 95;		//영어
		
		//byte kor3 = 50, math3 = 40, eng3 = 90; //국어점수, 수학점수, 영어점수
		
		
		int n1 = 10;
		int n2 = 40;
		
		//동일한 변수명을 사용할 수 없다.
		//int n1 = 20;
		//Error : Duplicate local variable n1
		
		//자료형과 상관없이 모든 변수명은 유일해야 한다!!!
		//short n1 = 30;
		//Error : Duplicate local variable n1
		
	}//main

}
