package javaPractice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="divya love devesh somuch";
		s.charAt(0);
	    char a[]=s.toCharArray();
		int count=0;
		for(int i=a.length-1;i>=0;i--)
		{
			
			if(a[i]==' ')
			{
				for(int j=i+1;j<=i+count;j++)
				{
					System.out.print(a[j]);
				}
				//System.out.print(' ');
			count=0;	
			}
			if(i==0) 
			{
				for(int j=i;j<i+count;j++)
				{
				System.out.print(a[j]);
				}
			}
			count++;
}
			
}
			
}
