package t2_array;

import java.util.Arrays;

public class Test6_2 {
	public static void main(String[] args) {
		char[] strArray = {'K','o','r','e','a'};
		
		for(int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		System.out.println(strArray);
		System.out.println("==========================");
		
		System.out.println("strArray의 길이 : " + strArray.length);
		System.out.println();
		
		System.out.println("strArray을 문자열로변환 : " + Arrays.toString(strArray));
		System.out.println();
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println("strArray["+i+"] = " + strArray[i]);
		}
		System.out.println();
		
		String str = "Korea";
		// 현재 문자열중에서 특정 인덱스에 위치한 문자를 반환? charAt()
		for(int i=0; i<str.length(); i++) {
			System.out.println("str("+i+") = " + str.charAt(i));
		}
	}
}
