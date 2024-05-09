package String;
public class ADemo {
public static void main(String[] args) 
	{
	 String a="India is My Country";
	 
	String b[]= a.split(" ");
	String rev="";
	for(String c:b)
	{
		String words=" ";
		for(int i=c.length()-1;i>=0;i--)
		{
			words=words+c.charAt(i);
	}
		
		rev=rev+words;
	}
	System.out.println(rev);
	
	} 
}
