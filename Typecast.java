public class Typecast
{
public static void main(String args[] )
{
	int a = 100;
	float b = a;
	System.out.println("Implicit Typecasting");
	System.out.println(b);
	
	float c = 4.34f;
	int d = (int)c;
	System.out.println("Explicit Typecasting");
	System.out.println(d);
	
	byte e = 20;
	short f = e;
	System.out.println("Implicit Typecasting");
	System.out.println(f);
	
	char g = ' ';
	 int h = g;
	System.out.println("Implicit Typecasting");
	System.out.println(h);
	
	int i = 48;
	char j = (char)i;
	System.out.println("Explicit Typecasting");
	System.out.println(j);
	
}
}