package javaPractice;

public class Simple {
	static int i=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Simple s=new Simple();
		s.test();
//		System.out.println(i);
	}
	
	public void test()
	{
	int i=200;
	System.out.println(i);
	System.out.println(Simple.i);
		
	}

}
