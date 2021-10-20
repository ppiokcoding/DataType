package DataType;

public class dataType03 {
	
	public static void main(String[] args) {
		
		//[자바 자료형]
		// - 메모리에 공간이 생기는 구조의 차이
		
		/*
		 1. 값형
		 	- 숫자(byte, short, int, long, float, double)
		 	- 문자(char)
		 	- 논리(boolean)
		 	
		 2. 참조형
		 	- String
		
		 */
		

		//자바 변수
		// - 메모리의 할당된 공간
		// - 용도 : 데이터 저장 + 입출력
		// - 가독성 높음 -> 데이터의 의미 부여
		
		//자바 상수(Literal)
		// - 데이터 자체(표기)
		
		//자바 상수(final 변수)
		// - 한번 값을 할당하면 수정이 불가능한 변수
		// - 예) 파이(pi) 3.14
		
		
		
		//*총정리
		// - 모든 자료형 + 변수 생성하기 + 데이터 대입 + 화면 출력
		
		//자바 키워드(Keyword), 자바 예약어(reserves word)
		// - 컴파일러와 약속된 단어
		
		//1) byte
		byte b1;
		b1 = 10;
		b1 = 127;
		//b1 = 128;
		b1 = -128;
		//b1 = -129;
		System.out.println(b1);
		
		//2) short
		short s1, s2;
		s1 = 10000;
		s1 = 32767;
		//s1 = 32768;
		
		//변수 -> 상자(공간)
		s1 = 10; //패턴
		s1 = 20; //10 표현 패턴 삭제 -> 20 표현 패턴 표시
		s1 = -32768;
		s1 = Short.MAX_VALUE;
		s2 = Short.MIN_VALUE;
		System.out.println("shortMax: "  + s1);
		System.out.println("shortMin: "  + s2);
		
		//정수형 리터럴(상수)
		// - 정수형을 가지는 데이터를 표현
		// - 아라비안 숫자만 가능
		// - 10
		// - 32768
		// - 2100000000
		
		//3) int
		int n1;
		n1 = 2100000000;
		n1 = Integer.MAX_VALUE;
		n1 = Integer.MIN_VALUE;
		System.out.println("int: " + n1);
		
		
		//-----------------------------------------------------
		//유틸(Utility) 클래스, 래퍼(Wrapper) 클래스
		// - 각 자료형에 도움이 되는 여러가지 기능을 제공한다.
		//1. byte 	   -> Byte
		//2. short 	   -> Short
		//3. int 	   -> Integer
		//4. long 	   -> Long
		//5. float 	   -> Float
		//6. double    -> Double
		//7. boolean   -> Boolean
		//8. char 	   -> (X)
		//------------------------------------------------------
		
		//4) long
		long l1;
		l1 = 10;
		//l1 = 10000000000
		//Error : The literal 10000000000 of type int is out of range 
		l1 = 10000000000L;
		System.out.println("long: " + l1);
		
		//정수형 리터럴
		// - 사용처에 상관없이 이미 자료형이 정해져 있다.
		// - 무조건 int
		// - 소스 파일에 적혀있는 모든 정수형 리터럴은 int형이다.
		
		//byte m1 = 10;
		// - byte m1
		// - 10
		// - m1 = 10;
		
		byte m1 = 10;
		short m2 = 10;
		int m3 = 10;
		long m4 = 10;
		System.out.println(10);
		System.out.println(10000000000l); //소문자 1처럼 보여서 비권장
		System.out.println(10000000000L); //대문자 권장
		
		//m4의 자료형은? > long					(o)
		//m1의 자료형은? > byte					(o)
		//112라인 우측의 10의 자료형은? short 		(x)
		//113라인 우측의 10의 자료형은? int  		(x)
		//115라인 출력되는 10의 자료형은? > ????

		
		//*단축어--------------------------
		//Ctrl + Alt + 방향키(위, 아래)
		//Alt + 방향키(위, 아래)
		//--------------------------------
		
		
		//int 자료형
		// - 운영체제의 처리 bit와 동일하게 할당
		// - 64bit 운영체제 > CPU가 한번에 처리하는 데이터의 양
		// - 현재 4byte
		// - 이전 2byte
		// - 이전 1byte
		
		//실수형 리터럴
		// - 아라비안 숫자 + '.'
		// - double(정밀도 때문에 채택)
		// - float  변수에 저장할 실수 상수는 접미어('F')를 적어야 한다.
		// - double 변수에 저장할 실수 상수는 접미어('D')를 적어야 한다.
		
		//5) float
		float f1;
		f1 = 3.14F;
		System.out.println("float: " + f1); //3.14
		
		//6) double
		double d1;
		d1 = 3.14;
		System.out.println("double: " + d1); //3.14
		
		f1 = 12345.1234567890123456789012345678901234567890F;
		d1 = 12345.1234567890123456789012345678901234567890D;
		
		System.out.println("float: " + f1);
		System.out.println("double: " + d1);
		
		//출력
		//float: 12345.123
		//double: 12345.123456789011
		
		//byte  > 사용 거의 안함
		//short > 이전 시스템과 호환성을 위해 제공하는 자료형 > 사용 거의 안함
		//int   > 기본 자료형(***)
		//long  > 확장 자료형(***)
		//float > 이전 시스템과 호환성을 위해 제공하는 자료형 > 사용 거의 안함
		//double> 기본 자료형(***)
		
		
		//문자형 리터럴(상수)
		// - 어떻게 표기?
		// - '문자'
		
		//7) char
		char c1;
		c1 = 'A';
		c1 = '가';
		c1 = '天';
		b1 = 5;
		c1 = '5'; //숫자 5가 아니다!! 문자 5이다. 53(약속된 코드값)
		//c1 = 'AB'; //이건 경우의 수가3가지라서 안됨 변수하나는 한가지 경우의 수만 저장 가능
		System.out.println("char: " + c1);
		
		//논리형 리터럴
		// - true, false // 예약어 상수 표현
		//8) boolean
		boolean flag;
		flag = true;  //참
		flag = false; //거짓
		System.out.println("boolean: " + flag);
		
		
		//추가자료형
		
		//9) 문자열, String
		// - 참조형
		// - 문자의 열
		// - 문자들의 집합 자료형 > N개의 문자들의 모음
		// - "문자열" > 문자열 리터럴
		
		// '아무개' -> 변수에 저장 -> 출력
		// 자기소개(1000자) -> 변수에 저장 -> 1000개 생성
		char name1 = '아';
		char name2 = '무';
		char name3 = '개';
		System.out.println("" + name1 + name2 + name3);
		
		String name;
		name = "김수한무";
		System.out.println(name);
		
		
		//----------------------------------------------------------------------
		//변수 명명법
		//1. 영대소문자, 숫자, '_'
		//2. 숫자로 시작x
		//3. 예약어 사용 불가
		//4. 의미있게 ****
		
		int korscore;
		//int 국어점수;
		
		int KORSCORE;
		
		int kor_score;
		int korScore;
		int KorScore;
		// int kor-score;  "-" : 연산자로 처리해서 이거쓰면 안됨 
		
		int score1;
		//int 1score;
		int _1score;
		//----------------------------------------------------------------------
		
		//컴파일러 > 내부(파서, Parser -> 구문들을 최소의 단위(토큰, Token)로 쪼개서 구문 검사)
		
		//int math score; //문장이 math에서 끝난다고 인식함. 그래서 score을 식별자로 인식X
		
		//예약어는 쓸 수 없다.
		//int int;
		//int byte;
		//int String;
		//int public; ===> 다 쓰면 안됨!
		
		//국어점수
		int a; //x -> 가독성
		
		//int kor_score;
		
		//Serial Number: 'NA0125478'
		String s = "NA0125478"; 				// 0점
		String sn = "NA0125478"; 				//2~30점
		String serialNumber = "NA0125478"; 		//100점
		
		System.out.println(s);
		System.out.println(sn);
		System.out.println(serialNumber);  // Ctrl + Enter 하면 풀네임 창 나옴
		
		//----------------------------------------------------------------------
		
		//[ 식별자 명명법 패턴 ]
		//1. 헝가리언 표기법
		//2. 파스칼 표기법
		//3. 카멜 표기법
		//4. 스네이크 표기법
		//5. 케밥 표기법
		
		//1. 헝가리언 표기법
		// - 식별자를 만들 때 식별자의 접두어로 해당 자료형을 표시하는 방법
		// - 사용) 인터페이스명
		// 			- interface IHello {}     I가 인터페이스 의미하는 것!
		int inum;
		int int_num;
		int iNum;
		byte bNum;
		String nickname;
		String strNickname;
		
		//2. 파스칼 표기법
		// - 식별자 단어의 첫문자를 대문자로 표기 + 나머지 문자를 소문자로 표기 
		// - 2개 이상의 단어가 모이면 각 단어의 첫문자를 대문자로 표기
		// - 사용) 클래스명  (정확한 파스칼 표기법은 "_" 쓰지 않는다)
		
		String StudentName;
		String English;
		
		//3. 카멜표기법
		// - 식별자 단어의 첫문자를 소문자로 표기 + 나머지 문자를 소문자로 표기 
		// - 2개 이상의 단어가 모이면 각 단어의 첫문자를 대문자로 표기
		// - 사용) 변수명, 메소드명 
		
		int notesize;
		int noteSize;
		int note;
		int noteWeight;
		int noteColor;
		
		//4.스네이크 표기법
		// - 전부 소문자로 표기
		// - 합성어 > 단어를 '_' 연결
		// - 사용) 정해지지 않음 > 마음대로 용도껏
		int note_color;
		int note_size;
		int note_cover_color;
		
		//5. 케밥 표기법
		// - 전부 소문자로 표기
		// - 합성어 > 단어를 '-' 연결
		// - 사용) 자바 불가능
		//int note-color;
		//int note-size;
		
		byte engScore;
		engScore = 90;
		System.out.println("영어점수: " + engScore + "점 입니다."); //+(concat)
		System.out.println();
		
		int cellPhoneWeight;
		cellPhoneWeight = 200;
		System.out.println("핸드폰 무게: " + cellPhoneWeight + "g입니다.");
		System.out.println();
		
		
	}//main

}
