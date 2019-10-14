package morgan;

public class MaxDiff {

	public static void main(String[] args) {
		int a[]=new int[] {1, 2, 90, 10, 110};
		int max=a[1]-a[0];
		int min;
		if(a[1]>a[0])
			min=a[0];
		else
			min=a[1];
		for(int i=2;i<a.length;i++)
		{
			if(a[i]-min>max)
				max=a[i]-min;
			if(min>a[i])
				min=a[i];
		}
		System.out.println("max ="+max);

	}

}
