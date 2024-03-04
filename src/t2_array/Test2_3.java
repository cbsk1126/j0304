package t2_array;

public class Test2_3 {
	public static void main(String[] args) {
		String name;
		//int kor, eng, mat, soc, sci;
		int[] jumsu = {100, 80, 30, 90, 70};
		int tot = 0;
		double avg;
		char grade;
		
		name = "홍길동";
//		kor = 100;
//		eng = 80;
//		mat = 30;
//		soc = 90;
//		sci = 70;
		
		//tot = kor + eng + mat + soc + sci;
		//tot += jumsu[0] + jumsu[1] + jumsu[2] + jumsu[3] + jumsu[4];
		for(int i=0; i<5; i++) {
			tot += jumsu[i];
		}
		
		avg = tot / 5.0;
		
		if(avg >= 90) grade = 'A';
		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else if(avg >= 60) grade = 'D';
		else grade = 'F';
		
		System.out.println("성명 : " + name);
//		System.out.println("국어 : " + kor);
//		System.out.println("영어 : " + eng);
//		System.out.println("수학 : " + mat);
//		System.out.println("사회 : " + soc);
//		System.out.println("과학 : " + sci);
		for(int i=0; i<5; i++) {
			System.out.println("jumsu["+i+"] = " + jumsu[i]);			
		}
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);
		System.out.println("작업끝...");
	}
}
