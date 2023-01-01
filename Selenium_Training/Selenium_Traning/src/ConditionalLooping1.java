import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class ConditionalLooping1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,3,5,4,6,7,8,9,10,11,12,13,14,15,16}; // array can be defined like this
		
	   for (int i=0;i<arr2.length;i++) 
	   {
		   if(arr2[i] % 2 == 0)
		   {
		   System.out.println(arr2[i]); 
		   break;
		   }
		   else
		   {
		   System.out.println(arr2[i]+"Is not multiple of 2");
		   }
	   }
	   
	   ArrayList<String> a = new ArrayList<String>();
	   a.add("Chakravarthi");
	   a.add("sneha");
	   a.add("samsthitha");
	   System.out.println(a.get(2));                                                                                                                                                                                                                               
	   
	   
	}
}	
