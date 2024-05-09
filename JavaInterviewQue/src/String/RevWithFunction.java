package String;

public class RevWithFunction {

	public static String reverse(String a)
	{
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		return a;
	}
	
	
	public static void main(String[] args) 
	{
		String a="Siddeshwr";
		RevWithFunction.reverse(a);

	}

}
