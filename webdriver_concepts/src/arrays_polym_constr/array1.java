package arrays_polym_constr;

public class array1 {
	


		public static void main(String[] args) {
			//Single dimensional arary
			String [] a = {"Selenium","rc","qtp","test"};
			System.out.println(a.length);
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i] + " ");
			}
			
			//multidimensional array
			
			int [][] a1 = {{2,2,3,4},{8,7,6,5}};
			System.out.println(a1[0].length);
			for(int i=0;i<a1.length;i++) {
				for(int j=0;j<a1[i].length;j++) {
					System.out.print(a1[i][j] + " ");
				}
				System.out.println();
				
				
			}
			
		}

	}

