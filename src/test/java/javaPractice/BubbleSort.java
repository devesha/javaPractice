package javaPractice;

public class BubbleSort {

	public static void main(String[] args) 
{
		
		
		double a[] = {1,2,3,2,2,2,4,5,6,2,2,1.9,2.1};
		double temp;


		for (int i=0;i<a.length;i++)	
		{
		 for (int j=i+1;j<a.length;j++)
		 {
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		 }
		}



		for(int i=0;i<a.length;i++)	
		{
			System.out.println(a[i]);
			
		}



}
		
		
		
}

