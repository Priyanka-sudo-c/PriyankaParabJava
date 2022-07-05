/*
 * Design a class to overload a function series() as follows: [15]
(a) void series (int x, int n) – To display the sum of the series given below:
x1 + x2 + x3 + ……………. xn terms
(b) void series (int p) – To display the following series:
     0, 7, 26, 63 p terms.
(c) void series () – To display the sum of the series given below:
    1/2+1/3+1/4+......1/10
 */
package com.edu.over;
class OverloadSeries{
	
	void series(int x, int n) {
		double s=0;
		for(int i=1;i<=n;i++) {
			s=s+Math.pow(x, i);
		}
		
		System.out.println("sum of x1 + x2 + x3 + ……………. xn="+s);
	}
	
	void series(int p) {
		for(int i=1;i<=p;i++) {
			System.out.print((i*i*i)-1+" , ");
		}
		System.out.println();
	}
	void series() {
		 double s=0;
		for(int i=2;i<=10;i++) {
		 s=s+((double)1/i);	 
        }
		System.out.println("Sum of 1/2+1/3+1/4+......1/10 ="+s);
	}
}

public class OverloadingMain{

	public static void main(String[] args) {
		OverloadSeries ob = new OverloadSeries();
		ob.series();
		ob.series(6);
		ob.series(2, 10);
     }

}
