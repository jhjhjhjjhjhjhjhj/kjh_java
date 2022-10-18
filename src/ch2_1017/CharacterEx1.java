package ch2_1017;

public class CharacterEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		// ch1 변수를 형변환, 명시적 형변환
		//캐스팅 연산자를 갑자기 사용하고 있음
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 55;
	
		System.out.println(ch3);
		System.out.println((char)ch3);
		System.out.println("======================================");

		char ch11 = '한';
		char ch22 = '\uD55C';
		
		System.out.println(ch11);
		System.out.println(ch22);
		
	}

}
