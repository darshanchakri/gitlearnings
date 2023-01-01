
public class CreateMethod_AccessMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateMethod_AccessMethod MC = new CreateMethod_AccessMethod();
		String Name = MC.getData();
		System.out.println(Name);
		getData2();
		

	}
	public String getData() // this access by other classes as well.//void is returning not nothing but executes the lines of code
	{
      System.out.println("Hello Tuesday");
      return "Sudershan is Learning";
      
	}
	
	public static String getData2()
	
	{
		System.out.println("This is a Static block");
		return "String getData2 is been exeuted";
	}
}
