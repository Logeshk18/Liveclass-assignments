package method_overload;

public class Method_overloading {

	public int calculate(int a,int b)
	{
		return (int)(a+b);
	}
	public int calculate(int a)
	{
		int c = (22/7)*(a*a);
		return c;
	}
	public int calculat(int a,int b)
	{
		int c = a*b;
		return c;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overloading m=new Method_overloading();
		int a=m.calculate(4,6);
		int b=m.calculate(4);
		int c=m.calculat(3,5);
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		

	}

}
