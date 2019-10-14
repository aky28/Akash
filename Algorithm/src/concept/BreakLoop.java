package concept;

public class BreakLoop {

	public static void main(String[] args) {
		outerloop:
		for(int i=0;i<5;i++)
		{
			innerloop:
			for(int j=1;j<3;j++)
			{
				System.out.println(i*j);
				break innerloop;
			}
		}

	}

}
