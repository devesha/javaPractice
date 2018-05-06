package javaPractice;

public class SecondLargest {

	public static void main(String[] args) {

		int a[]= {300,5000,6000,700,500,400,300,300,900,100};
		int l=Integer.MAX_VALUE;
		int sl=Integer.MAX_VALUE;
		for (int i=0;i<a.length;i++)
		{
		if(a[i]<l)
		{
			sl=l;
			l=a[i];
				
		}
		else if(a[i]>=l && a[i]<sl)
		{
			sl=a[i];
			
		}
		}
		System.out.println(l + "and "+ sl);
	}

}
