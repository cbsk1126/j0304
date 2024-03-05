package t2_array;

import java.util.Arrays;
import java.util.Scanner;

// Arrays클래스 사용법
public class Test13_Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] m = new int[10];
		int su, cnt = 0;
		
		// 입력된 자료를 배열에 저장하기(for문을 사용하는것이 더 효율적이다.)
		while(true) {
			cnt++;
			System.out.print(cnt + ". 10개의 2자리 정수를 입력하세요? ");
			su = sc.nextInt();
			m[cnt-1] = su;
			if(cnt == 10) break;
		}
		
		// 원본 자료 출력
		System.out.print("원본 데이터 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " / ");
		}
		System.out.println();
		
		// Arrays클래스의 sort()메소드를 이용한 자료의 정렬
		Arrays.sort(m);
		
		// 정렬된 자료 출력
		System.out.print("정렬 데이터 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " / ");
		}
		
		sc.close();
	}
}
