package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class CountNumber {

	
	public static void main(String[] args) {
		int number;
		 	
		int a[] = {0,1,2,2,2,4,5,6,7,6,9,9};
		Map<Integer,Integer> m= new HashMap<Integer, Integer>();
	int largestnum=0;
	int SL=0;
	int numberKey=a[0];
	 int slNumberKey=a[0];
	 boolean counter;
	for(int i=0;i<a.length;i++)
	{	
		if(m.containsKey(a[i]))
		{
			counter=true;
			m.put(a[i], m.get(a[i])+1);		
		}else
		{
			counter=false;
			m.put(a[i],1);
		}
		
		if(m.get(a[i])>largestnum)
		{
			if(!counter) {
			SL=largestnum;
			slNumberKey=numberKey;
			}
			numberKey=a[i];
			largestnum=m.get(a[i]);
				
		}else if(m.get(a[i])<=largestnum && m.get(a[i])>SL)	
		{
			SL=m.get(a[i]);
			slNumberKey=a[i];
		}		
	}
	System.out.println(numberKey + " largest : "+ largestnum);
	
	System.out.println(slNumberKey + " SL largest : "+ SL);
//	for(Integer key:m.keySet())
//	{
//		System.out.println(key + " : "+ m.get(key));	
		
//	}
	
   /*int largest=0;
   
	for(Integer key:m.keySet())
	{
		if(m.get(key)>largest)
		{
			largest=m.get(key);
			number=key;
		}	
			
	}
	System.out.println(number + " : "+ largest);*/
	
	

}
	
}


