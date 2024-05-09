package String;

public class RevWithSamePosition {
 
  public static void main(String [] args)
  {
	  String x="India is My Country";
	  
	  String y[] = x.split(" ");
	  
	  String rev="";
	  
	  for(String z:y)
	  {
		  String words=" ";
		  for(int i=z.length()-1;i>=0;i--)
		  {
			  words=words+z.charAt(i);
			  
		  }
		  rev=rev+words;
	  }
	  System.out.println(rev);
  }
}
