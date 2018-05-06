package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class BubbleBee {

	public static void main(String[] args) {

		
		String s= "bubble bee";
		char a[]=s.toCharArray();
		
		Map<String,Integer> m = new HashMap();
		
		for(int i=0;i<a.length-1;i++)
		{
			
			if(m.containsValue(Character.toString(a[i])))
			{
				m.put(Character.toString(a[i]), m.get(Character.toString(a[i]))+1);
			}
			else
			{
				m.put(Character.toString(a[i]),1);	
			}
		}	
		
		for(String key:m.keySet())
		{
			System.out.println(key + +m.get(key));
		}
	}

}
