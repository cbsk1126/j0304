package t1_memory;

import java.util.Scanner;

public class Test1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ans = 0;	// 1:계속, 0:그만
		int cnt = 0;
		
		while(true) {
			cnt++;
			System.out.println(cnt);
			System.out.print("작업을 계속할까요?(1:계속, 0:그만) ");
			ans = sc.nextInt();
			if(ans == 0) break;
		}
		System.out.println("작업끝...");
		
		sc.close();
	}
}
