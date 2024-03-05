package t2_array;

import java.util.Scanner;

// 2차원 배열 연습하기(100명 이내의 학생이 입력된다.)
public class Test15_2Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 작업에 필요한 변수 정의하기
		String[] name = new String[100];
		int[][] jumsu = new int[100][4];
		double[] avg = new double[100];
		char[] gr = new char[100];
		int cnt = 0, tot = 0, total = 0;
		String[] title = {"성명","국어","영어","수학","총점","평균","학점"};
		
		// 학생 자료 입력과 계산처리
		for(int i=0; i<name.length; i++) {
			System.out.print("학생 이름을 입력하세요?(종료시는 999)==>> ");
			name[i] = sc.next();
			if(name[i].equals("999")) break;
			
			for(int j=0; j<3; j++) {
				System.out.print(title[j+1] + "점수를 입력하세요? ");
				jumsu[i][j] = sc.nextInt();
				tot += jumsu[i][j];
			}
			jumsu[i][3] = tot;
			avg[i] = tot / 3.0;
			if(avg[i] >= 90) gr[i] = 'A';
			else if(avg[i] >= 80) gr[i] = 'B';
			else if(avg[i] >= 70) gr[i] = 'C';
			else if(avg[i] >= 60) gr[i] = 'D';
			else gr[i] = 'F';
			total += tot;
			tot = 0;
			cnt++;
		}
		
		// 입력한 학생자료와 계산된 값들을 출력처리
		System.out.println("\n\t\t*** 성 적 표 ***");
		System.out.println("===================================================================");
		System.out.println("번호\t성명\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("-------------------------------------------------------------------");
		for(int i=0; i<cnt; i++) {
			System.out.print((i+1) + "\t" + name[i] + "\t");
			for(int j=0; j<4; j++) {
				System.out.print(jumsu[i][j] + "\t");
			}
			System.out.printf("%.2f\t%c\n", avg[i], gr[i]);
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("\t\t\t총평균%.2f, 인원수:%d명\n", ((double)total/cnt/3), cnt);
		System.out.println("===================================================================");
		
		sc.close();
	}
}
