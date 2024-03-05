package t3_exam;

import java.util.Scanner;

// 가위/바위/보 게임...
public class Test4_가위바위보 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("* 가위/바위/보 게임 *");
		
		while(true) {
			int computer = (int)(Math.random()*3)+1;
			// System.out.println("computer : " + computer);
			
			System.out.print("가위(1), 바위(2), 보(3)를 입력하세요? ==> ");
			int na = scanner.nextInt();
			
			int temp = na - computer;
			
			if(temp == 0) System.out.println("컴퓨터와 비기셨습니다.");
			else if(temp == 1 || temp == -2) System.out.println("축하합니다. 이기셨군요.");
			else System.out.println("아깝습니다. 컴퓨터승리~ 다음에 도전하세요");
			
			System.out.print("게임을 계속 진행 하시겠습니까?(y/n) " );
			String yn = scanner.next();
			if(yn.toUpperCase().equals("N")) break;
		}
		System.out.println("게임을 종료합니다.");
		
		scanner.close();
	}
}
