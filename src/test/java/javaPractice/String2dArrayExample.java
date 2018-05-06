package javaPractice;

public class String2dArrayExample {

	public static void main(String[] args) {
		
	
		//2d array 		dynamic initialization
	/*	int[][] s= new int[4][4];
		int count=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				s[i][j]=count;
				count++;
				System.out.print(s[i][j]+" ");
			}		
			System.out.println("");
		}	*/
		
		//Static initialization
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
		
		for(String[] rows: s)
		{
			
			for(String s1:rows)
			{	
				
			System.out.print(s1 + "  ");
			}
			System.out.println("  ");
		}	
			
		/*for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(s[i][j] + "  ");
				
			}
			
			System.out.println("  ");
			
		}
		*/
		
		
		
		
		

	}

}
