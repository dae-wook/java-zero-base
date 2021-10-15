
public class Exam1 {

	public static void main(String[] args) {
		
		
		char name1 = '김';
		char name2 = '대';
		char name3 = '욱';
		char max = Character.MAX_VALUE;
		for (char min = Character.MIN_VALUE; min <= max ; min++ ) {
			if (min == name1 || min == name2) {
				System.out.printf("0x%02X", (int)min);
				System.out.print(",");
			}else if (min == name3) {
				System.out.printf("0x%02X%n", (int)min);
				break;
			}
			
		}
		
	}
	
	
}
