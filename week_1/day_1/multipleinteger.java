class multiplyinteger{
public static void main(String[] args) {
	int p=1;
	int a[]={1,3,7,4};
	int b[]=new int[a.length];
	for (int i=0;i<a.length;i++) {
		b[i]=p;
		System.out.println(b[i]);
		p=a[i]*p;
	}

		
	


	int pr=1;
	int c[]=new int[a.length];
	for (int j=a.length-1;j>=1;j-- ) {
		c[j]=b[j]*pr;
		System.out.println(c[j]);
		pr=pr*a[j];
	}


	for (int k=0;k<c.length;k++ ) {
		System.out.println(c[k]);
		
	}
}
	
}
