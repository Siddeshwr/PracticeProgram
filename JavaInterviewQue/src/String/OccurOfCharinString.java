package String;

import java.util.HashMap;

public class OccurOfCharinString {

	public static void main(String[] args)
	{
		String a="India is my Country I Love My Country";
		
		char ch;
		int count;
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<a.length();i++)
		{
			ch=a.charAt(i);
			if(hm.containsKey(ch))
			{
				count=hm.get(ch);
				count++;
				hm.replace(ch,count);
			}
			else
			{
				hm.put(ch,1);
			}
		}
		for(Character key:hm.keySet())
		{
			System.out.print(key+"="+hm.get(key)+",");
		}

	}

}
