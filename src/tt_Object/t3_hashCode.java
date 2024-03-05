package tt_Object;

import java.util.HashMap;

// Object클래스의 hashCode로 비교할시는 주로 HashMap객체에서의 비교시에 사용하는데, 이때 비교값은, 내용도 같아야하고(equals), 해시코드(위치값)도 같아야 정말 같은것으로 본다.(Hash~붙은 객체타입들은 모두 적용됨)
public class t3_hashCode {
	public static void main(String[] args) {
		// HashMap의 키값은 중복될수 없다. 즉 중복되면 같은키로 간주해서 나중 키값의 데이터를 덮어쓰게된다.(여기서 HashMap객체를 hashCode로 비교시는 '키가 같다'의 기준이, 값도 같아야(equals는 true)하고 해시코드(위치값)도 같아야 정말같은것으로 본다.
		HashMap<Integer, String> map = new HashMap<>();
		
		// 아래 키값이 같은 '1'을 넣게되면 같은 값으로 보기때문에 나중자료가 키값 '1'의 '데이터1'을 덮어쓰게된다.
		map.put(1, "데이터1");
		map.put(1, "데이터2");
		map.put(2, "데이터3");
		System.out.println(map);	// 결과는 3개가 아닌 2개만 출력된다. 결과 : {1=데이터2, 2=데이터3}
		
		// 아래는 HashMap의 키값에 객체를 넣고 같은지를 비교해본다.(이때 HashMap의 비교는 hashCode로 비교하기에, 값과 해시코드(위치값)모두같아야 같은것으로 간주한다.
		HashMap<Bb3, String> map2 = new HashMap<>();
		map2.put(new Bb3("첫번째"), "데이터1");
		map2.put(new Bb3("첫번째"), "데이터2");
		map2.put(new Bb3("두번째"), "데이터3");
		System.out.println(map2);	// hashCode로 비교하기에 값은 같아도 생성된 객체의 위치가 다르기에 해시코드값은 다르다. 따라서, 결과는 키가 서로다른것으로보기에 3개가 출력된다. 결과 : {두번째=데이터3, 첫번째=데이터1, 첫번째=데이터2}
		
		// 앞의 예에서 값이 같으면 해시코드도 같은것으로 간주되게 해서 결과가 2개만 나오게 하고 싶다면 Bb4클래스에 hashCode()메소드를 오버라이딩해서 필드명이 같으면 같다고 리턴시켜준다.
		HashMap<Bb4, String> map3 = new HashMap<>();
		map3.put(new Bb4("첫번째"), "데이터1");
		map3.put(new Bb4("첫번째"), "데이터2");
		map3.put(new Bb4("두번째"), "데이터3");
		System.out.println(map3);	// hashCode로 비교하지만 Bb4객체에서 hashCode를 오버라이드해서 필드값이 같으면 해시코드도 같은것으로 주소를 보냈기에, 앞의 같은필드값을 보낸객체의 키는 같은것으로본다. 따라서, 결과는 2개가 출력된다. 결과 : {첫번째=데이터2, 두번째=데이터3}
	}
}

class Bb3 {
	String name;
	
	Bb3(String name) {
		this.name = name;
	}
	
	// Object객체의 equals()메소드를 오버라이드해서 기존변수값과 넘어온변수값이 같으면 true를 반환시키게한다.
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((Bb3)obj).name) return true;	// obj.name은 다운캐스팅해서 Bb3객체의 name의 값을 가리키게한다.
		else return false;
	}
	
	// toString메소드를 오버라이딩해서 자신의 필드값(name필드값)이 출력되도록 재정의하자.
	@Override
	public String toString() {
		return name;
	}
}

class Bb4 {
	String name;
	
	Bb4(String name) {
		this.name = name;
	}
	
	// Object객체의 equals()메소드를 오버라이드해서 기존변수값과 넘어온변수값이 같으면 true를 반환시키게한다.
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((Bb4)obj).name) return true;	// obj.name은 다운캐스팅해서 Bb3객체의 name의 값을 가리키게한다.
		else return false;
	}
	
	// 필드값이 같으면 hashCode(위치값)도 같도록 hashCode()메소드를 오버라이드해보자.
	@Override
	public int hashCode() {
		return name.hashCode();	// name이라는 문자열이 같으면 객체는 새로 생성시키지않고 같은곳을 가리키게 얕은복사가 되므로 hashCode도 같게된다.
	}
	
	// toString메소드를 오버라이딩해서 자신의 필드값(name필드값)이 출력되도록 재정의하자.
	@Override
	public String toString() {
		return name;
	}
}