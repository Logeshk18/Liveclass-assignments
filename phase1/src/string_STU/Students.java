package string_STU;

	public class Students {
	
		int s1,s2,s3;
		String name;
		int age;
		char section;
		char gender;
	
		int total;
		double percent;
		public Students(){s1=0;}
		public Students(String name,int age,char section,char gender,int s1,int s2,int s3){
		this.age=age;
		this.name=name;
		this.section=section;
		this.gender=gender;
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
}
	public Students(String name,int age,char section,char gender,int s2,int s3)
{
		this.age=age;
		this.name=name;
		this.section=section;
		this.gender=gender;
		this.s2=s2;
		this.s3=s3;
}
	public int totalmarks()
{
		total=this.s1+this.s2+this.s3;
		return total;
}
	public double percentage(){
		percent=(total/3);
		return percent;
}
	public void display()
{
		System.out.println("Student details:"+this. name+" "+this.age+" "+this.section+" "+this.gender);
		System.out.println("total marks:"+totalmarks());
		System.out.println("total percentage:"+percentage());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj1=new Students("Venkat",21,'A','M',92,86,90);
		Students obj2=new Students("Vijay",24,'B','M',99,84);
		Students obj3=new Students("Sneha",22,'A','F',90,88,90);
		Students obj4=new Students("Elango",19,'C','M',94,70);
		
	obj1.display();
	obj2.display();
	obj3.display();
	obj4.display();
			}

}