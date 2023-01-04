
public class StringUsageExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an Object  //String literal
		
		//below mentioned are objects with  string literals
		String s2 = new String("welcome");
		String s3 = new String ("To the String World");
		String s1 = new String ("welcome");
		
		//below mentioned are string objects
		
		String S4 = "Sudershan is a good boy";
		String S5 = "Sneha is a wife of Sudershan";
		String S6 = "Samsthitha is our only Daughter";
		
		String[] stringsplit = s3.split("String");
		System.out.println(stringsplit.length);
		//how do you trim
		System.out.println(stringsplit[0]+stringsplit[1].trim());
		// iterate by character
		for (int i= S6.length()-1;i>=0;i--)
		{
			System.out.println(S6.charAt(i));
		}
		
		

	}

}
