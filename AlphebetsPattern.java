class AlphebetsPattern{
	public static void main(String args[]){
		char a='A';
		int i,j;
		for(i=1;i<=3;i++)
		{
			for(j=0;j<i;j++){
				System.out.print((char)(a+j)+" ");
		    }
			System.out.println("");
		}
	}
}	