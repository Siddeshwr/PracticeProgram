package Array;

public class ClosestZeroNum {

	public static void main(String[] args) {
		int a[]= {22,31,15,5,90,34};
		
		int close=a[0];
		for(int i=0;i<a.length;i++){
			int temp=a[i];
			if(Math.abs(temp)<Math.abs(close)) {
				close=temp;
			}
			else if (Math.abs(temp)==Math.abs(close) && Math.abs(temp)>Math.abs(close)){
				close=temp;
			}
			}
		System.out.println(close);
			
		}

	}
