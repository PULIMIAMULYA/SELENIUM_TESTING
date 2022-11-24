package alerts_windows_frames;

public class polymorphism {
	
	public void add() {
		
	}
	public void add(int a, int b) {
		//int a=10;
		//int b=20;
		int c=a+b;
		 System.out.println( c);
	}
	public void add(double x, double y) {
		//double x=10;
		//double y=20;
		double z=x+y;
		 System.out.println(z );
	}
	public void add(String a1,String b1) {
		//String a1=amu;
		//String b1=apple;
		String c1= a1+b1;
		System.out.println( c1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism p= new polymorphism();
		p.add();
		p.add(10, 20);
		p.add(20.032455, 20.83576);
		p.add("amulya", "ammulu");

	}

}
