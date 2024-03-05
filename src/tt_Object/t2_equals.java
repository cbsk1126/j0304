package tt_Object;

public class t2_equals {
	public static void main(String[] args) {
		Aa2 aa1 = new Aa2("안녕");
		Aa2 aa2 = new Aa2("안녕");
		
		System.out.println(aa1 == aa2);      // aa1객체와 aa2객체는 서로다른 객체이기에 주소값(hashCode)은 다르다. 결과: false
		System.out.println(aa1.equals(aa2)); // aa1객체와 aa2객체는 서로다른 객체이기에 주소값이 가리키는곳의 내용도 다르다. 결과: false
		System.out.println();
		
		// Bb2객체는 Object객체의 equals()메소드를 오버라이드해서 같은 값이면 true가 되도록 처리했다.
		Bb2 bb1 = new Bb2("안녕");
		Bb2 bb2 = new Bb2("안녕");
		Bb2 bb3 = new Bb2("안녕3");
		
		System.out.println(bb1 == bb2);      // bb1객체와 bb2객체는 서로다른 객체이기에 주소값(hashCode)은 다르다. 결과: false
		System.out.println(bb1.equals(bb2)); // bb1객체와 bb2객체는 서로다른 객체이지만, equals()메소드를 재정의해서 매개값이 같으면 서로같도록(true) 재정의했다. 결과: true
		System.out.println(bb1.equals(bb3)); // bb1객체와 bb3객체는 서로다른 객체, equals()메소드를 재정의해서 매개값이 같으면 서로같도록(true) 재정의했다. 결과: false
	}
}

class Aa2 {
	String name;
	
	Aa2(String name) {
		this.name = name;
	}
}

class Bb2 {
	String name;
	
	Bb2(String name) {
		this.name = name;
	}
	
	// Object객체의 equals()메소드를 오버라이드해서 기존변수값과 넘어온변수값이 같으면 true를 반환시키게한다.
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((Bb2)obj).name) return true;	// obj.name은 Object객체에 name이 없기에 에러이다. 따라서 다운캐스팅해서 Bb2객체의 name의 값을 가리키게한다.
		else return false;
	}
}
