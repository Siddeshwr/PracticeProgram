package Number;

public class ADemos {

	public static void main(String[] args) {

        ADemos ad=new ADemos();
        ad.maxNum();
       ad.minNum();
        ad.sortArray();
        ad.closeToZero();

	}

	public void maxNum()
	{
		int a[]= {1,21,15,20,3,91};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(max<=a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
	
	public void minNum()
	{
		int a[]= {12,23,45,21,75};
		
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(min>=a[i])
			{
				min=a[i];
			}
		}
		
		System.out.println(min);
	}
	
	public void sortArray()
	{
		int a[]= {1,21,34,56,78,9,34,2,11};
	
	    int temp=0;
	    
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=i+1;j<a.length;j++)
	    	{
	    		if(a[i]<a[j]) //Descending
	    		{
	    		temp=a[i];
	    		a[i]=a[j];
	    		a[j]=temp;
	    		}
	    	}}
	     
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.print(" "+a[i]);
	    }
	 System.out.println("Second Smallest "+a[a.length-1]);
	}
	
	public void closeToZero()
	{
		int num []= {-2,3,5,10};
		int close=num [0];
		
		for(int i=0;i<num.length;i++)
		{
			int temp=num[i];
			if(Math.abs(temp)<Math.abs(close)){
				close=temp;}
			else if(Math.abs(temp)==Math.abs(close) &&Math.abs(temp)>Math.abs(close)) {
				close=temp;
			}
		}
		System.out.println(close);
	//System.out.println(Math.abs(close));//will give +ve int
		
	}
	
	
	
}

