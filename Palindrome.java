package week2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="madam";
		String rev="";
		
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+original.charAt(i);
			System.out.println(rev);
			
		}
		
		if (original.equals(rev)){
			System.out.println("Palindrome: "+rev);
			
		}
	}

}
