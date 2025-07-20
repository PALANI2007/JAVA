import java.util.Scanner;

public class userinput
{
	public static void main(String args[]){
		int a;
		char b;
		float c;
		double d;
		short e;
		long f;
		byte g;
		boolean h;
		
		
		Scanner p = new Scanner(System.in);
		System.out.println("Enter int value : ");
		a = p.nextInt();
		System.out.println(a);
		
	   System.out.println("Enter char value : ");
	   b = p.next().charAt(0);
	   System.out.println(b);
	   
	   System.out.println("Enter float : ");
	   c = p.nextFloat();
	  	System.out.println(c);
		
		System.out.println("Enter double : ");
		d = p.nextDouble();
	    System.out.println(d);
		
		System.out.println("Enter short : ");
		e = p.nextShort();
		System.out.println(e);
		
		System.out.println("Enter long : ");
		f = p.nextLong();
		System.out.println(f);
		
		System.out.println("Enter byte : ");
		g = p.nextByte();
		System.out.println(g);
		
		System.out.println("Enter Boolean : ");
		h = p.nextBoolean();
		System.out.println(h);










	 
}
}