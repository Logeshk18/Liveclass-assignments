package shapeArea;

public class Shape {
	int a,b,c;
	float f;
	double x;
	
	Shape(){
		
	}
	Shape(int r)
	{
		a=r;
		x=a*a;
	}
	Shape(int m,int n)  
	{
		b=m;
		c=n;
		x=b*c;
		
	}
	Shape(float d)
	{
		f=d;
		x=3.14*(f*f);
	}
	void area()
	{
		System.out.print("Area is " +x );
		System.out.print("\n");
	}
	
	void display(int a,int b)   //method overloading
	{
		x=(a*b)/2;
		System.out.println("Area of triangle "+x);
	}
	void display(float a,float b)
	{
		x=(a*b)/2;
		System.out.println("Area of rhombus "+x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape square=new Shape(6);
		Shape rectangle=new Shape(4,8);
		Shape circle=new Shape(2f);
		square.area();
		rectangle.area();
		circle.area();
		new Shape().display(4, 6);
		new Shape().display(4f, 4f);
	}

}



