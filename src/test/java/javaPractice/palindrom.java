package javaPractice;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int	num=121;
	int temp=num;	
	int r;
	int sum=0;
	
	while(num>0)
	{
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;		
		
	}	
		
	System.out.println(sum);	
	
	}

}
