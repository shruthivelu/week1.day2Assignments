package week1.day2Assignments;

public class Assignment1_NegNumtoPosiNum {

	public static void main(String[] args) {
		int num = -40;
		int positiveval ;
		if (num<0) {
			
		positiveval = ~(num -1);
		System.out.println("The number -40 is converted to 40");		
		
		}
		else {
			System.out.println("The number -40 is not converted to 40");		
		}
		

	}

}
