package t2_array;

// 2차원배열(불규칙 값 저장)
/*
    100 90 80  50
     80 50 90 100
     90 10 20  90
 */
public class Test11_1 {
	public static void main(String[] args) {
		int[][] atom = 
			{
				{100,90,80,50},
				{80,50,90,100},
				{90,10,20,90}
			};
		
		
		
		// 배열에 저장된 형태 그대로 출력하기
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(atom[i][j] + "\t");
			}
			System.out.println();	
		}
	}
}
