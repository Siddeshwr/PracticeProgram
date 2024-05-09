package Array;

public class ExactCopyArray {

	public static void main(String[] args) {

    int a[] = {1,15,7,19};
    
    int b[]=a.clone();
//    int b[]=new int[a.length];
//    b=a;
    
    for(int i=0;i<b.length;i++)
    {
    	System.out.println(b[i]);
    }

	}

}
