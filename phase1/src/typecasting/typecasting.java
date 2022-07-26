package typecasting;

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		float f=5.2F;
		long lg=(long) f;
		System.out.println("Float --> long: " + lg); 
		
		double d=70.2;
		char c=(char) (int) (long) d;
		System.out.println("Double --> Long --> Int --> Char: " + c);
		
		long lg1=66825574;
		byte bt=(byte) lg1;
		System.out.println("Long --> Byte: " + bt);
		
		int a=54;
		long lg2=(long) (double) a;
		System.out.println("Int --> Double --> Long: " + lg2);
			}
		}

	


