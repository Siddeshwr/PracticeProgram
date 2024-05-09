package String;

public class StringBasics {

	public static void main(String[] args)
	{
		String a=" India is My Country ";
		String b= a.trim();
		System.out.println(b);
		
		String c="and its my Pride";
		String d=a.concat(c);
		System.out.println(d);
		
		String z[]=d.split(" ");

          for(int i=0;i<z.length;i++)
          {
        	  System.out.print(z[i]);
          }

	}

}
