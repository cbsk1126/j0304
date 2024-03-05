package t3_exam;

public class Test4_SelectionSort2_점검 {
	public static void main(String[] args) {
		//int[] m = new int[6];
		//int[] m = new int[] {};
		int[] m = {1,2,3,7,9,8};
		int temp = 0;
		int sw;
		
		System.out.print("원본자료 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " ");
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			sw = 0;
			for(int j=i+1; j<=6; j++) {
				System.out.println("0." + m[i-1] + " , " + m[j-1]);
				if(m[i-1] > m[j-1]) {
					System.out.println(m[i-1] + " , " + m[j-1]);
					temp = m[i-1];
					m[i-1] = m[j-1];
					m[j-1] = temp;
					sw = 1;
				}
			}
			if(sw == 0) break;
		}
		
		System.out.print("정렬자료 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " ");
		}
	}
}
