package sujinPractice;

public class Control {
	public static void main(String[] args) {
		int age=68;
		if(age>16 && age<20) {
			System.out.println("청소년할인");
		}
		else if(age>65) {
			System.out.println("경로우대할인");
		}
	}
}

/*
 age<16 -> 청소년할인			
 age>65 -> 할인가능
 */
