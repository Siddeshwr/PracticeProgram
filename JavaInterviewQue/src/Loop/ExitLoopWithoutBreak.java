package Loop;

public class ExitLoopWithoutBreak {

	public static void main(String[] args) {
	
		boolean keeprunning=true;
		
		while(keeprunning)
		{
			System.out.println("Good to go ");
			keeprunning=false;
		}

	}

}
