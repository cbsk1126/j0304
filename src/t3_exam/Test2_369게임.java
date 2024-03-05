package t3_exam;

/*
 배열을 이용한 369게임
1~100까지의 수를 차례로 출력하되 3, 6, 9 자리는 숫자가 아닌, '짝'이라는 문자로 대치하시오.(한줄에 10개씩 출력하시오)
예) 1 2 짝 4 5 짝 7 ~~~~~ 28 짝 짝 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40 41 42 짝 44 ~~~
*/
public class Test2_369게임 {
	public static void main(String[] args) {
		String[] num = new String[100];
		int sw;
		String temp;
		
		// num[]배열에 3,6,9 대신에 '짝'문자열을 저장
		for(int i=0; i<num.length; i++) {
			num[i] = (i + 1) + "";
			temp = "";
			sw = 0;
			
			for(int j=0; j<num[i].length(); j++) {
				if(num[i].charAt(j)=='3' || num[i].charAt(j)=='6' || num[i].charAt(j)=='9') {
					temp += "짝";
					sw = 1;
				}
			}
			if(sw == 1) num[i] = temp;
		}
		
		// num[]배열에 저장된 값을 10개씩 출력
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
			if((i+1) % 10 == 0) System.out.println();
		}
	}
}
