package com.verizon;

public class array {
	public static void main(String[] args) {
		int a[]= {2,23,46,57,89,7,6};
		int sum=0;
		for (int i=0; i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("sum:"+sum);
		int b[]=new int[5];
		System.arraycopy(a, 0, b, 2, 2);
		for(int i=0; i<b.length;i++)
			System.out.print(b[1]+ " ");
	}

}
