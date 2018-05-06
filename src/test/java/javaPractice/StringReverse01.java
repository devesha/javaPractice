package javaPractice;

public class StringReverse01 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		String s = "a$b$!$c$d$e";
		char a[]=s.toCharArray();
		int n= a.length-1;
		
		for(int i=0;i<=n;i++)
		{
			if(Character.isLetter(a[i]) && Character.isLetter(a[n-i]))
			{
				System.out.print(a[n-i]);
			}
			else
			System.out.print(a[i]);	
		}
	}

}
