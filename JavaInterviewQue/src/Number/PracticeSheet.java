package Number;

public class PracticeSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeSheet ps=new PracticeSheet ();
		ps.addition();
		ps.largeandSmallNum();
		
	}
	
	public void addition()
	{
		int a[]= {1,15,19,7};
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);}
	
	public void largeandSmallNum()
	{
		int a[]= {1,19,23,7,91,15,5};
		
		int min=a[0];
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(min<=a[i])
			{
				System.out.println("Smallest Number is "+a[i]);
			}
		}
	
	    for(int i=0;i<a.length;i++)
	    {
		if(max<=a[i])
		{
			if(max<=a[i])
			{
				System.out.println("Largest Number is "+a[i]);
			}
		}
	}}


}
