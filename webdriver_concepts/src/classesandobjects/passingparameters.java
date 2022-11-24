package classesandobjects;

public class passingparameters {
	public void add(int x,int y) {
		int z= x+y;
		System.out.println(z);
	}
	public void sub(int x1,int y1) {
		int z1= x1+y1;
		System.out.println(z1);
	}
	public void mul(int x2,int y2) {
		int z2= x2*y2;
		System.out.println(z2);
	}
	public static void main(String[] args) {
		passingparameters p=new passingparameters();
		p.add(2,3);
		p.sub(2,3);
		p.mul(2,3);
	}


}
