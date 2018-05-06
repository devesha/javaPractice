package javaPractice;

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a[]= {2,1,2,2};
	int odNumber=0;
	int number=0;
	int count=0;
	boolean flag;
	for (int i=0; i<a.length;i++)
	{
		for(int j=1;j<a.length;j++)
		{
		if(a[i]==a[j])
		{
			flag=true;
			number=a[i];
			count++;
		}else
		{
			flag=false;
			odNumber=a[j];
			//System.out.println(a[j]);
		}
		
		}
		System.out.println(odNumber);
		return odNumber
		break;
	}
	
	
	}

}
