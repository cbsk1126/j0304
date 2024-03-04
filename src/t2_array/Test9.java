package t2_array;

// 2차원배열
/*
    1  2  3  4
    5  6  7  8
    9 10 11 12
 */
public class Test9 {
	public static void main(String[] args) {
		int[][] atom = new int[3][4];
		
		// 값 기억시키기
		int cnt = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				cnt++;
				atom[i][j] = cnt;
			}
		}
		
		// 배열에 저장된 형태 그대로 출력하기
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(atom[i][j] + "\t");
			}
			System.out.println();	
		}
	}
}
