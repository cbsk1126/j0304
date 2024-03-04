package t3_exam;

public class Test2_369게임 {
	public static void main(String[] args) {
		String[] num = new String[100];
		int sw;
		String temp;
		
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
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
			if((i+1) % 10 == 0) System.out.println();
		}
	}
}
