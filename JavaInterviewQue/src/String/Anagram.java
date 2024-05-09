package String;

public class Anagram {

	public String Ana(String a)
	{
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(a.equals(b))
		{
			System.out.println("String is An Angram");
		}
		else
		{
			System.out.println("String is Not an Anagram");
		}
		return a;
	}
	public static void main(String[] args)
	{
		String a="madam";
		Anagram an=new Anagram();
		an.Ana(a);

	}

}
