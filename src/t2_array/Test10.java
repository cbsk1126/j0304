package t2_array;

// 2차원배열
/*
    4  3  2  1
    8  7  6  5
    12 11 10 9
 */
public class Test10 {
	public static void main(String[] args) {
		int[][] atom = new int[3][4];
		
		// 값 기억시키기
		int cnt = 5;
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				cnt--;
				atom[i][j] = cnt;
			}
			cnt += 8;
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
