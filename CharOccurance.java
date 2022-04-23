package week2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to chennai";
		int temp=0;
				
	char[] chstr=str.toCharArray();
		int len=chstr.length;
		
	 for(int i=0;i<=len-1;i++) {
		 if (chstr[i]=='e'){
			 temp++;
				 
		 }
	 }
	 System.out.println(temp);
	 
}
}


/*  if (str.contains("e")) {
			temp++;
		}
		System.out.println(temp);*/