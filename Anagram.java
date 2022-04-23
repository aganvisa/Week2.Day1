package week2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text1="stops";
String text2="potss";
int length1=text1.length();
int length2=text2.length();
if (length1==length2) {
	System.out.println("Both Strings are same in length ");
}
else
{
	System.out.println("Both Strings are not same in length ");
}

char [] chtext1=text1.toCharArray();
char [] chtext2=text2.toCharArray();

System.out.println(chtext1);
System.out.println(chtext2);

Arrays.sort(chtext1);
Arrays.sort(chtext2);

for(char ch:chtext1) {
System.out.println(ch);	
}
for(char ch:chtext2) {
System.out.println(ch);	
}

//Alternate way to print the sorted char values.
// System.out.println(Arrays.toString(chtext2));   
	}

}
