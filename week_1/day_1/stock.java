# competetive-program
class stockprice {
	public static void main(String[] args) {
		int arr[]={10,7,5,8,11,9};
		int firstprice=arr[0];
		int firstprofit=arr[1]-arr[0];
		// int secondprofit=0;
		for(int i=1;i<arr.length;i++){

			int secondprice=arr[i];
			// System.out.println(secondprice+"hhhhhb");

			int secondprofit=secondprice-firstprice;
			// System.out.println(secondprofit+"second");

			

			firstprofit=Math.max(firstprofit,secondprofit);
			// System.out.println(firstprofit+"llllll");


			firstprice=Math.min(firstprice,secondprice);
			// System.out.println(firstprice+"first");

		}
		// System.out.println(secondprofit);
		System.out.println(firstprofit);

	}
	
}
