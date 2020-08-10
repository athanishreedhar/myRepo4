package TestBase1;

public class stsicnonStatic {
	
	int a=10;
	static int b=20;
	int c;
	stsicnonStatic ee;
	public static void m1() {
		
		stsicnonStatic d = new stsicnonStatic();
		d.a=25;
		d.c=d.a+b;
		System.out.println(d.c);
		
	}

	
	public static void main(String[] args) {
		int x=10;
		// TODO Auto-generated method stub
		stsicnonStatic e= new stsicnonStatic();
		e.m1();
		e.c=e.a+b;
		System.out.println(e.c);
		//ee = new stsicnonStatic();
		//ee.m1();
	}

}
