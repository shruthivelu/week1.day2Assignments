package week1.day2Assignments;

public class Assignment3_Palindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		String rev = "";	
		
							
		for (int i = str.length()-1; i >=0; i--) {
			rev = rev+str.charAt(i);
		}
			
			if (str.equals(rev)) {
				System.out.println(str+" is a Palindrome");
			}
			else {
				System.out.println(str+" is not a Palindrome");
			}	
				
				
	}

}
