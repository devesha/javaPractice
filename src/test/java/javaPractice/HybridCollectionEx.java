package javaPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HybridCollectionEx {

	
	int a;
	String h;
	public static void main(String[] args) {
		String[][] s=new String[][] {
			{"The Hobbit","user1"},
			{"Long Go Long","user2"},
			{"Durjoy Dutt","user2"},
			{"The Hobbit","user1"},
			{"Long Go Long","user1"},
			{"Durjoy Dutt","user2"},
			{"The Hobbit","user4"},
			{"Long Go Long","user4"}
		};
		
	/*	for(String[] rows: s)
		{
			
			for(String s1:rows)
			{	
				
			System.out.print(s1 + "  ");
			}
			System.out.println("  ");
		}*/
		
		// primitive types cannot be used in hashmap key or value pair
		// key must be immutable
		// value can be a class object or wrapper class for primitive types
		// capacity for hashmap here would be maximum of string length
		Map<String,Set<String>> map=new HashMap<>(s.length);
		
		int j=0;
		for(int i=0;i<s.length;i++)
		{
			
			if(!map.containsKey(s[i][j]))
			{
				map.put(s[i][j], new HashSet<String>());
//				map.put(s[i][j], 1);
			
			}
//			count=map.get(s[i][j]);
//			map.put(s[i][j],count+1);
			map.get(s[i][j]).add(s[i][j+1]);
			
			}
		
		for(String key: map.keySet())
		{
			
		System.out.println(key + "user : "+map.get(key).size());
		
		}

}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((h == null) ? 0 : h.hashCode());
		return result;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HybridCollectionEx other = (HybridCollectionEx) obj;
		if (a != other.a)
			return false;
		if (h == null) {
			if (other.h != null)
				return false;
		} else if (!h.equals(other.h))
			return false;
		return true;
	}
	


}
