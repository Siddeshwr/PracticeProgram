package String;

import java.util.HashMap;

public class OccuOfWordInString {

	public static void main(String[] args)
	{
		String a="India is My Country and My Country is My Pride";
		
		String b[]=a.split(" ");
		int count;
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(String words:b)
		{
			if(hm.containsKey(words))
			{
				count=hm.get(words);
				count++;
				hm.replace(words, count);
			}
			else
			{
				hm.put(words,1);
			}
		}
		for(String key:hm.keySet())
		{
			System.out.println(key+"="+hm.get(key));
		}

	}

}
