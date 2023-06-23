package practice;

public class nonstaticmethodwithparameter {

	public static void main(String[] args) {
		
		nonstaticmethodwithparameter n1=new nonstaticmethodwithparameter();
		int c = n1.s1(10, 20);
		System.out.println(c);
		
	       s2(22,434);
		
	}
	public int s1(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	
	public static int s2(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;
	}
}
