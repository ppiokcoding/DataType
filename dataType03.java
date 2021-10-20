package DataType;

public class dataType03 {
	
	public static void main(String[] args) {
		
		//[�ڹ� �ڷ���]
		// - �޸𸮿� ������ ����� ������ ����
		
		/*
		 1. ����
		 	- ����(byte, short, int, long, float, double)
		 	- ����(char)
		 	- ��(boolean)
		 	
		 2. ������
		 	- String
		
		 */
		

		//�ڹ� ����
		// - �޸��� �Ҵ�� ����
		// - �뵵 : ������ ���� + �����
		// - ������ ���� -> �������� �ǹ� �ο�
		
		//�ڹ� ���(Literal)
		// - ������ ��ü(ǥ��)
		
		//�ڹ� ���(final ����)
		// - �ѹ� ���� �Ҵ��ϸ� ������ �Ұ����� ����
		// - ��) ����(pi) 3.14
		
		
		
		//*������
		// - ��� �ڷ��� + ���� �����ϱ� + ������ ���� + ȭ�� ���
		
		//�ڹ� Ű����(Keyword), �ڹ� �����(reserves word)
		// - �����Ϸ��� ��ӵ� �ܾ�
		
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
		
		//���� -> ����(����)
		s1 = 10; //����
		s1 = 20; //10 ǥ�� ���� ���� -> 20 ǥ�� ���� ǥ��
		s1 = -32768;
		s1 = Short.MAX_VALUE;
		s2 = Short.MIN_VALUE;
		System.out.println("shortMax: "  + s1);
		System.out.println("shortMin: "  + s2);
		
		//������ ���ͷ�(���)
		// - �������� ������ �����͸� ǥ��
		// - �ƶ��� ���ڸ� ����
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
		//��ƿ(Utility) Ŭ����, ����(Wrapper) Ŭ����
		// - �� �ڷ����� ������ �Ǵ� �������� ����� �����Ѵ�.
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
		
		//������ ���ͷ�
		// - ���ó�� ������� �̹� �ڷ����� ������ �ִ�.
		// - ������ int
		// - �ҽ� ���Ͽ� �����ִ� ��� ������ ���ͷ��� int���̴�.
		
		//byte m1 = 10;
		// - byte m1
		// - 10
		// - m1 = 10;
		
		byte m1 = 10;
		short m2 = 10;
		int m3 = 10;
		long m4 = 10;
		System.out.println(10);
		System.out.println(10000000000l); //�ҹ��� 1ó�� ������ �����
		System.out.println(10000000000L); //�빮�� ����
		
		//m4�� �ڷ�����? > long					(o)
		//m1�� �ڷ�����? > byte					(o)
		//112���� ������ 10�� �ڷ�����? short 		(x)
		//113���� ������ 10�� �ڷ�����? int  		(x)
		//115���� ��µǴ� 10�� �ڷ�����? > ????

		
		//*�����--------------------------
		//Ctrl + Alt + ����Ű(��, �Ʒ�)
		//Alt + ����Ű(��, �Ʒ�)
		//--------------------------------
		
		
		//int �ڷ���
		// - �ü���� ó�� bit�� �����ϰ� �Ҵ�
		// - 64bit �ü�� > CPU�� �ѹ��� ó���ϴ� �������� ��
		// - ���� 4byte
		// - ���� 2byte
		// - ���� 1byte
		
		//�Ǽ��� ���ͷ�
		// - �ƶ��� ���� + '.'
		// - double(���е� ������ ä��)
		// - float  ������ ������ �Ǽ� ����� ���̾�('F')�� ����� �Ѵ�.
		// - double ������ ������ �Ǽ� ����� ���̾�('D')�� ����� �Ѵ�.
		
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
		
		//���
		//float: 12345.123
		//double: 12345.123456789011
		
		//byte  > ��� ���� ����
		//short > ���� �ý��۰� ȣȯ���� ���� �����ϴ� �ڷ��� > ��� ���� ����
		//int   > �⺻ �ڷ���(***)
		//long  > Ȯ�� �ڷ���(***)
		//float > ���� �ý��۰� ȣȯ���� ���� �����ϴ� �ڷ��� > ��� ���� ����
		//double> �⺻ �ڷ���(***)
		
		
		//������ ���ͷ�(���)
		// - ��� ǥ��?
		// - '����'
		
		//7) char
		char c1;
		c1 = 'A';
		c1 = '��';
		c1 = '��';
		b1 = 5;
		c1 = '5'; //���� 5�� �ƴϴ�!! ���� 5�̴�. 53(��ӵ� �ڵ尪)
		//c1 = 'AB'; //�̰� ����� ����3������ �ȵ� �����ϳ��� �Ѱ��� ����� ���� ���� ����
		System.out.println("char: " + c1);
		
		//���� ���ͷ�
		// - true, false // ����� ��� ǥ��
		//8) boolean
		boolean flag;
		flag = true;  //��
		flag = false; //����
		System.out.println("boolean: " + flag);
		
		
		//�߰��ڷ���
		
		//9) ���ڿ�, String
		// - ������
		// - ������ ��
		// - ���ڵ��� ���� �ڷ��� > N���� ���ڵ��� ����
		// - "���ڿ�" > ���ڿ� ���ͷ�
		
		// '�ƹ���' -> ������ ���� -> ���
		// �ڱ�Ұ�(1000��) -> ������ ���� -> 1000�� ����
		char name1 = '��';
		char name2 = '��';
		char name3 = '��';
		System.out.println("" + name1 + name2 + name3);
		
		String name;
		name = "����ѹ�";
		System.out.println(name);
		
		
		//----------------------------------------------------------------------
		//���� ����
		//1. ����ҹ���, ����, '_'
		//2. ���ڷ� ����x
		//3. ����� ��� �Ұ�
		//4. �ǹ��ְ� ****
		
		int korscore;
		//int ��������;
		
		int KORSCORE;
		
		int kor_score;
		int korScore;
		int KorScore;
		// int kor-score;  "-" : �����ڷ� ó���ؼ� �̰ž��� �ȵ� 
		
		int score1;
		//int 1score;
		int _1score;
		//----------------------------------------------------------------------
		
		//�����Ϸ� > ����(�ļ�, Parser -> �������� �ּ��� ����(��ū, Token)�� �ɰ��� ���� �˻�)
		
		//int math score; //������ math���� �����ٰ� �ν���. �׷��� score�� �ĺ��ڷ� �ν�X
		
		//������ �� �� ����.
		//int int;
		//int byte;
		//int String;
		//int public; ===> �� ���� �ȵ�!
		
		//��������
		int a; //x -> ������
		
		//int kor_score;
		
		//Serial Number: 'NA0125478'
		String s = "NA0125478"; 				// 0��
		String sn = "NA0125478"; 				//2~30��
		String serialNumber = "NA0125478"; 		//100��
		
		System.out.println(s);
		System.out.println(sn);
		System.out.println(serialNumber);  // Ctrl + Enter �ϸ� Ǯ���� â ����
		
		//----------------------------------------------------------------------
		
		//[ �ĺ��� ���� ���� ]
		//1. �밡���� ǥ���
		//2. �Ľ�Į ǥ���
		//3. ī�� ǥ���
		//4. ������ũ ǥ���
		//5. �ɹ� ǥ���
		
		//1. �밡���� ǥ���
		// - �ĺ��ڸ� ���� �� �ĺ����� ���ξ�� �ش� �ڷ����� ǥ���ϴ� ���
		// - ���) �������̽���
		// 			- interface IHello {}     I�� �������̽� �ǹ��ϴ� ��!
		int inum;
		int int_num;
		int iNum;
		byte bNum;
		String nickname;
		String strNickname;
		
		//2. �Ľ�Į ǥ���
		// - �ĺ��� �ܾ��� ù���ڸ� �빮�ڷ� ǥ�� + ������ ���ڸ� �ҹ��ڷ� ǥ�� 
		// - 2�� �̻��� �ܾ ���̸� �� �ܾ��� ù���ڸ� �빮�ڷ� ǥ��
		// - ���) Ŭ������  (��Ȯ�� �Ľ�Į ǥ����� "_" ���� �ʴ´�)
		
		String StudentName;
		String English;
		
		//3. ī��ǥ���
		// - �ĺ��� �ܾ��� ù���ڸ� �ҹ��ڷ� ǥ�� + ������ ���ڸ� �ҹ��ڷ� ǥ�� 
		// - 2�� �̻��� �ܾ ���̸� �� �ܾ��� ù���ڸ� �빮�ڷ� ǥ��
		// - ���) ������, �޼ҵ�� 
		
		int notesize;
		int noteSize;
		int note;
		int noteWeight;
		int noteColor;
		
		//4.������ũ ǥ���
		// - ���� �ҹ��ڷ� ǥ��
		// - �ռ��� > �ܾ '_' ����
		// - ���) �������� ���� > ������� �뵵��
		int note_color;
		int note_size;
		int note_cover_color;
		
		//5. �ɹ� ǥ���
		// - ���� �ҹ��ڷ� ǥ��
		// - �ռ��� > �ܾ '-' ����
		// - ���) �ڹ� �Ұ���
		//int note-color;
		//int note-size;
		
		byte engScore;
		engScore = 90;
		System.out.println("��������: " + engScore + "�� �Դϴ�."); //+(concat)
		System.out.println();
		
		int cellPhoneWeight;
		cellPhoneWeight = 200;
		System.out.println("�ڵ��� ����: " + cellPhoneWeight + "g�Դϴ�.");
		System.out.println();
		
		
	}//main

}
