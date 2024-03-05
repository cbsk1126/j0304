package tt_Object;

/*
  1.Object객체의 hashCode()메소드는 객체의 값을 비교(HashMap객체 비교..)할때 사용하는데, 이때 값은 객체의 위치정보를 코드값(주소)으로 알려준다.
  2.Object객체의 toString()메소드를 그냥 수행하면 toString()메소드는 객체의 정보(패키지명.클래스명@hashCode)를 출력하는데,
  이때 toString()를 오버라이드해서 필요한 내용(필드값 등등..)을 참고받을수 있게사용한다.
*/
public class t1_toString {
	public static void main(String[] args) {
		// 모든 객체는 Object클래스를 상속받고 있기에 Object클래스의 hashCode(), toString()메소드를 아무 제한없이 사용할수 있다.
		Aa aa = new Aa();
		System.out.printf("%x\n", aa.hashCode());	// aa객체의 위치(주소)값을 16진수로 표현시켰다.
		System.out.println(aa);							// aa의 위치(주소)값이 16진수로 표시된다.(.toString()가 생략가능하다.)	
		System.out.println(aa.toString());	// 앞의 내용에 toString()를 붙여줘도 내용은 동일하다.
		System.out.println();

		// Bb객체내부에서 toString()메소드를 오버라이드해서 필요한 정보를 사용할수 있게 처리했다.
		Bb bb = new Bb();
		System.out.println(bb);						// bb객체의 toString()값이 출력되는데, 이때 toString()메소드는 bb객체가 오버라이드해두었기에 그 정보가 출력된다.
		System.out.println(bb.toString());// 앞줄의 내용과 동일하다.
	}
}

class Aa {
	int su1 = 10;
	int su2 = 20;
}

class Bb {
	int su1 = 10;
	int su2 = 20;
	
	@Override
	public String toString() {
		return "su1="+su1+" , su2="+su2;
	}
}