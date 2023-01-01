import java.util.ArrayList;

public class SetDatatype_N_Conditionallooping {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int myNum = 40; // defining integer
		String Name = " yrs Old Sudershan"; // defining String
		char Letter = 'G'; // defining character
		double Deci = 94.54; // defining float value or double value
		boolean Statement = true; // defining boolean
		int[] arr =  new int[5]; //array can be defined like this
		arr[0] = 50;
		arr[1] =100;
		arr[2] =150;
		arr[3] =200;
		arr[4] =250;
		
		int[] arr2 = {1,10,100,1000,10000}; // array can be defined like this
		
		System.out.println(myNum+Name+" "+Letter+" "+"Weight "+Deci+" KG"+" is "+Statement);
		
		for (int i=0;i<arr.length;i++) //for loop to iterate and manage the data as per the need
       {
		System.out.println(arr[i]);
		
       }
	   for (int i=0;i<arr2.length;i++) 
	   {
		   System.out.println(arr2[i]); 
		
	   }

	   String[] name = {"Chakri", "Sneha", "Samsthitha", "Suguna", "Rajender"};
	   
	   for (int i=0; i<name.length;i++)
	   {
		   System.out.println(name[i]); 
	   }
	   //array list declaration, addition and invocation and printing.
	   
	   ArrayList<String> a = new ArrayList<String>();
	   a.add("Rahul");
	   a.add("Sharma");
	   a.add("sneha");
	   a.add("sadurla");
	   System.out.println(a.get(0));
	   
	   
	}
}	
