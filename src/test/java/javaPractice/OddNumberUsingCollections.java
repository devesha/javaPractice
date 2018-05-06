package javaPractice;

public class OddNumberUsingCollections {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		oddnumber();
	}
	
	static int comNum;
	static int oddNum;
	public static void oddnumber()
	{
	int a[]= {3,3,2,2,3,4,2,2,1,6,3,3};
	
	for(int i=0;i<a.length-1;i++)
	{
			if(a[i]==a[i+1])
			{
				comNum=a[i];
			}
			else if(a[i]!=a[i+1] & a[i]!=comNum)
			{
				oddNum=a[i];
				
			}
			else
			{
				oddNum=a[i+1];
				
			}
	}
		System.out.println("common number  :  " + comNum);
		System.out.println("odd number  :  " + oddNum);	
		
	
	
	}

}
